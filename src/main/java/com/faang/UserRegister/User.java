package com.faang.UserRegister;

import java.util.List;

public class User {

    private static final List<String> VALID_JOBS = List.of("Google", "Uber", "Amazon");
    private static final List<String> VALID_ADDRESSES = List.of("London", "New York", "Amsterdam");

    private String name;
    private Integer age;
    private String job;
    private String address;

    public User() {
    }

    public User(String name, Integer age, String job, String address) {
        this.name = validateName(name);
        this.age = validateAge(age);
        this.job = validateJob(job);
        this.address = validateAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name should not be empty or null");
        }
        return name;
    }

    private Integer validateAge(Integer age) {
        if (age == null || age < 18) {
            throw new IllegalArgumentException("Age should not be null and must be at least 18");
        }
        return age;
    }

    private String validateJob(String job) {
        if (!VALID_JOBS.contains(job)) {
            throw new IllegalArgumentException("The workplace must be contained in the set of VALID_JOBS");
        }
        return job;
    }

    private String validateAddress(String address) {
        if (!VALID_ADDRESSES.contains(address)) {
            throw new IllegalArgumentException("The address must be contained in the set of VALID_ADDRESSES");
        }
        return address;
    }

}
