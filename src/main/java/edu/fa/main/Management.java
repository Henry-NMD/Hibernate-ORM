package edu.fa.main;

import java.util.Set;

import edu.fa.entities.Customer;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class Management {

	public static void main(String[] agrs) {
		Customer customer = new Customer(30, null);
//		CustomerDao.insertTrainee(customer);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Customer>> constraintViolations = validator.validate(customer);
		if (constraintViolations.size() > 0) {
			for (ConstraintViolation<Customer> a : constraintViolations) {
				System.out.println(a.getMessage());
			}
		}
	}

}
