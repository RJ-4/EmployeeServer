package com.nagarro.java.training.employee.getSession;

import static com.nagarro.java.training.employee.constants.Constants.HIBERNATE_CONFIG_FILE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSession {

	SessionFactory factory;
	
	public Session getSession(Class<?> mappedTableName){
	
		factory = new Configuration().configure(HIBERNATE_CONFIG_FILE)
									 	 .addAnnotatedClass(mappedTableName)
									 	 .buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		return session;
	
	}
		
	public void closeSession(){
		
		factory.close();
	}
}
