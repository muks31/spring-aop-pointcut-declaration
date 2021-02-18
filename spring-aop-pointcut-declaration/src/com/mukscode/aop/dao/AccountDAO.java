package com.mukscode.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO { 
	
	public void addAccount(Account theAccount, boolean testFlag) {
		System.out.println(getClass() + ": Doing My DB Work: Adding an Account");
	}

	public boolean doWork() {
		System.out.println("Do WORK");
		return true;
	}
}
