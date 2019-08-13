package com.ui;

import java.util.Random;
import java.util.Scanner;

import com.entity.Customer;
import com.service.BankService;

public class User {
	Random random=new Random();
	BankService bankService=new BankService();
	Customer customer = new Customer();
	Scanner scan = new Scanner(System.in);

	public void createAccount() {
		System.out.println("Customer Application");
		System.out.println("---------------------------------------");
		System.out.println("Enter Your Full Name:");
		String name = scan.next();
		customer.setName(name);
		System.out.println("Enter Your Mobile Number:");
		long phone = scan.nextLong();
		customer.setPhoneNumber(phone);
		System.out.println("Enter Your 12 Digit Aadhar Number:");
		long aadhar = scan.nextLong();
		customer.setAadharNumber(aadhar);
		System.out.println("Set Your Four Digit PIN Number :");
		int pin = scan.nextInt();
		long accNo=random.nextInt(1000000000);
		customer.setPin(pin);
		customer.setAccountNumber(accNo);
		customer.setBalance(500);
		System.out.println("Your Initial Balance: " + customer.getBalance());
		System.out.println("Your Account Number : " + customer.getAccountNumber());
		System.out.println("Your Account is created Successfully!!");
		bankService.createAccount(customer);

	}

	public void showBalance() {

	}

	public void deposit() {

	}

	public void withdraw() {

	}

	public void fundTransfer() {

	}

	public void printTransactions() {

	}

}
