package edu.fa.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.fa.entities.Customer;
import edu.fa.utils.HibernateUtils;


public class CustomerDao {
	/**
	 * Insert a Customer
	 * 
	 * @param trainee
	 */
	public static void insertTrainee(Customer cus) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.getSession();
			transaction = session.beginTransaction();
			session.save(cus);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
