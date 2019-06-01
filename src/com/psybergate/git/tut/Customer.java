package com.psybergate.git.tut;

import java.util.Date;

public class Customer {

	private long customerNum;

	private String name;

	private Date dateOfBirth;

	public Customer(long customerNum, String name, Date dateOfBirth) {
		super();
		this.customerNum = customerNum;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return String.format("Customer [customerNum=%s, name=%s, dateOfBirth=%s]", customerNum, name, dateOfBirth);
	}

}