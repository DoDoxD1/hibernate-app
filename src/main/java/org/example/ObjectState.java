package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectState {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Student student = new Student(112,"peter","Delhi");
        student.setCertificate(new Certificate("Hibernate","2 Months"));
        // student is in transient state

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);// student:persistent
        student.setName("Arihant");

        transaction.commit();
        session.close();
        //student:detached(from database)
        factory.close();
    }
}
