package org.example;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class FetchDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Student student = session.load(Student.class,102);
        Address address = session.get(Address.class,1);
        System.out.println(student);
        System.out.println(address.getCity());
        session.close();
        factory.close();
    }
}
