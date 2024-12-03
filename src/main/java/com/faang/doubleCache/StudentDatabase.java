package com.faang.doubleCache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDatabase {

    private static final HashMap<Student, Map<Subject, Integer>> studentGrades = new HashMap<>();
    private static final HashMap<Subject, List<Student>> subjectStudents = new HashMap<>();

    public void addNewStudent(Student student, Map<Subject, Integer> grades) {
        studentGrades.put(student, grades);
        for (Subject subject : grades.keySet()) {
            subjectStudents.putIfAbsent(subject, new ArrayList<>());
            subjectStudents.get(subject).add(student);
        }
    }

    public void addNewSubjectForExistingStudent(Student student, Subject subject, int grade) {
        Map<Subject, Integer> existingStudentGrades = studentGrades.get(student);
        if (existingStudentGrades != null) {
            existingStudentGrades.put(subject, grade);
            subjectStudents.putIfAbsent(subject, new ArrayList<>());
            subjectStudents.get(subject).add(student);
        }
    }

    public void removeStudent(Student student) {
        Map<Subject, Integer> subjects = studentGrades.remove(student);
        if (subjects != null) {
            for (Subject subject : subjects.keySet()) {
                List<Student> students = subjectStudents.get(subject);
                if (students != null) {
                    students.remove(student);
                }
            }
        }
    }

    public void printAllStudentsWithSubjects() {
        for (Map.Entry<Student, Map<Subject, Integer>> student : studentGrades.entrySet()) {
            Student key = student.getKey();
            System.out.println("Student: " + key);
            System.out.println("Subjects: " + student.getKey() + " Values: " + student.getValue());
        }
    }

}
