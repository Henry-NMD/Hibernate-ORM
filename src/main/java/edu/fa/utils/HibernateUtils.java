package edu.fa.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.fa.entities.Customer;

public class HibernateUtils {
	private static SessionFactory sessionFactory = null;

	static {
		try {
			loadSessionFactory();
		} catch (Exception e) {
			System.err.println("Exception while initializing hibernate util... ");
			e.printStackTrace();
		}
	}

	/**
	 * Create a session factory using hibernate.cfg.xml
	 */
	public static void loadSessionFactory() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Customer.class);
		sessionFactory = configuration.buildSessionFactory();
	}

	/**
	 * Open session
	 * 
	 * @return Session
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {
		Session session = null;
		try {
			// Create a session
			session = sessionFactory.openSession();
		} catch (Exception t) {
			System.err.println("Exception while getting session... ");
			t.printStackTrace();
		}

		// show error message
		if (session == null) {
			System.err.println("session is discovered null");
		}

		// return a session
		return session;
	}
}
