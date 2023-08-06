package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

//        Student  student = new Student(102,"Arihant","Meerut");
//        System.out.println(student);
//
//        Session session = factory.getCurrentSession();
//        session.beginTransaction();
//        session.save(student);
//        session.getTransaction().commit();
//        session.close();
        Address address = new Address();
        address.setStreet("Street1");
        address.setCity("Meerut");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(20.2);

        FileInputStream fis = new FileInputStream("src/main/resources/img.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
//        System.out.println(new File(".").getAbsolutePath());
        address.setImage(data);

//        System.out.println(address);

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();

    }
}