package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dao.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("Akshada");
		
		SessionFactory sessionfacory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfacory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		

	}

}
