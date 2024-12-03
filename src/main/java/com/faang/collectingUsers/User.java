package com.faang.collectingUsers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private Long id;
    private String name;
    private Integer age;
    private List<String> activities;

    public Map<User, String> findHobbyLovers(List<User> users, List<String> activities) {
        Map<User, String> result = new HashMap<>();
        for (User user : users) {
            List<String> userActivities = user.getActivities();
            for (String activity : userActivities) {
                if (activities.contains(activity)) {
                    result.put(user, activity);
                    break;
                }
            }
        }
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", activities=" + activities +
                '}';
    }

}
