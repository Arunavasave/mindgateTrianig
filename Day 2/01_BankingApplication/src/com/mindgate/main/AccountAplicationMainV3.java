package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountAplicationMainV3 {
	public static void main(String[] args) {
		System.out.println("Welcome to XYZ");
		Scanner scanner = new Scanner(System.in);

		int accountNumber;
		String name;
		double balance;
		int transactionChoice;
		double amount;
		boolean result;
		String continoueChoice;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter name");
		name = scanner.next();

		System.out.println(" Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println("account open succesfully");
		do {
			System.out.println("manu");
			System.out.println("Withdraw");
			System.out.println("Deposit");
			System.out.println("check balance");

			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter the amount to be Withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);

				if (result) {
					System.out.println(" Transaction completed succesfully");
					System.out.println("Balance::" + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance::" + account.getBalance());

				}
				break;
			case 2:
				System.out.println("Enter the amount to be Deposite");
				amount = scanner.nextDouble();
				result = account.deposite(amount);
				if (result) {
					System.out.println("Transaction completed succesfully");
					System.out.println("Balance::" + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance::" + account.getBalance());

				}
				break;
			case 3:
				System.out.println("Balance" + account.getBalance());
				break;
			default:
				System.out.println("invalid ");

			}
			System.out.println("do you want to continoue y o n");
			continoueChoice = scanner.next();
		} while (continoueChoice.equals("yes"));

	}

}
