package com.example;

public class Course {
    private String courseName;
    private int duration;

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    // toString() method
    @Override
    public String toString() {
        return "Course: " + courseName + ", Duration: " + duration + " months";
    }
}
