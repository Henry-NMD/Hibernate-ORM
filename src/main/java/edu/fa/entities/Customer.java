package edu.fa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "customer", catalog = "SMS")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "customer_id")
	private int customerId;
	@NotNull
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_status")
	private int studentStatus;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(int studentStatus) {
		this.studentStatus = studentStatus;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

}
