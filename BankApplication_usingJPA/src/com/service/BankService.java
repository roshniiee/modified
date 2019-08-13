package com.service;

import com.dao.BankDAO;
import com.entity.Customer;

public class BankService {
	BankDAO bankDao = new BankDAO();

	public void createAccount(Customer customer) {
		bankDao.beginTransaction();
		bankDao.createAccount(customer);
		bankDao.commitTransaction();
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
