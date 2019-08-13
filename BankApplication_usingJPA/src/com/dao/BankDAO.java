package com.dao;

import javax.persistence.EntityManager;

import com.entity.Customer;

public class BankDAO {
	EntityManager entity=UtilJava.getEntityManager();

	public void createAccount(Customer customer) {
		entity.persist(customer);

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
	public void commitTransaction() {
		entity.getTransaction().commit();
		
	}

	public void beginTransaction() {
		entity.getTransaction().begin();
		
}
}
