package com.demiscode.fundamentals;

public class Person {
    private String username;
    private int age;

    public Person(String username, int age) {
        setUsername(username);
        setAge(age);
    }

    public void setUsername(String username) throws NullPointerException {
        if (username == null)
            throw new NullPointerException("Username cannot be null or empty!");
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 0)
            throw new IllegalArgumentException("Age cannot be zero or negative!!");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
