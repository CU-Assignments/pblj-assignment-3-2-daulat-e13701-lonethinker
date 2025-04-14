package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Student bean
        Student student = context.getBean(Student.class);

        // Print student details
        System.out.println(student);
        
        // Close the context
        ((AnnotationConfigApplicationContext) context).close();
    }
}
