package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedding {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student student = new Student(106,"Rahul","Meerut");
        student.setCertificate(new Certificate("Android","6 Months"));

        Transaction transaction = session.beginTransaction();

        session.save(student);

        transaction.commit();
        session.close();
        factory.close();
    }
}
