package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Account account = new Account(101, "Arohi vasave", 5000);
		boolean result = account.withdraw(2000);
		if (result) {
			System.out.println(" Transaction completed succesfully");
			System.out.println("Balance::" + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println("Balance::" + account.getBalance());

		}
		System.out.println("-".repeat(50));
		//deposit
		result = account.deposite(1000);
		if(result) {
			System.out.println("Transaction completed succesfully");
			System.out.println("Balance::" + account.getBalance());
		}
		else {
			System.out.println("Transaction Failed");
			System.out.println("Balance::" + account.getBalance());
			
		}
		

	}

}
