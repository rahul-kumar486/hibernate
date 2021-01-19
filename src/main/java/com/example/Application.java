package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String [] args){
        Alien a = new Alien();
        a.setAid(1);
        a.setAname("mkmmk");
        a.setColor("black");
        Configuration con  = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(a);
        tx.commit();
    }
}
