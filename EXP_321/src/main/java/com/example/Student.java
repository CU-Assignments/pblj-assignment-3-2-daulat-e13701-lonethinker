package com.example;

public class Student {
    private String name;
    private Course course;

    // Constructor
    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    // toString() method
    @Override
    public String toString() {
        return "Student: " + name + "\n" + course;
    }
}