package com.example.hibernate.dao;

import com.example.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {
    private SessionFactory factory;

    public StudentDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void saveStudent(Student student) {
        Session session = factory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close(); // Ensure the session is closed
        }
    }

    public void closeFactory() {
        if (factory != null) {
            factory.close();
        }
    }
}
