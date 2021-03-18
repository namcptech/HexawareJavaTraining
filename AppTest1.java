package com.hexaware.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hexaware.entity.Employee;


public class AppTest1 {

	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
		configuration.configure("mysql.cfg.xml");
		SessionFactory  sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Employee  emp=new Employee();
		emp.setFirstName("First");
		emp.setLastName("Last");
		session.save(emp);
		Transaction  txt=session.beginTransaction();
		txt.commit();
		session.close();
		
	}

}
