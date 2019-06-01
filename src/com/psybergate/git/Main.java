package com.psybergate.git;

import java.time.Instant;
import java.util.Date;

import com.psybergate.git.tut.Customer;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(12, "Mike", Date.from(Instant.now()));
		System.out.println(customer);
	}
}
