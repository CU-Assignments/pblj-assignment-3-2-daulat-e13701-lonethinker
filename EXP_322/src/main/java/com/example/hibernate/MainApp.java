package com.example.hibernate;

import com.example.hibernate.dao.StudentDAO;
import com.example.hibernate.model.Student;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Create a new Student object
        Student student = new Student();
        student.setName("Spondondon");
        student.setAge(22);

        // Save student
        studentDAO.saveStudent(student);

        // Close session factory
        studentDAO.closeFactory();

        System.out.println("Student saved successfully!");
    }
}
