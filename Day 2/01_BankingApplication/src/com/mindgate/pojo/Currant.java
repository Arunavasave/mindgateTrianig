package com.mindgate.pojo;

public class Currant extends Account {
	private double overDraftBalance;
	

	public Currant() {
		System.out.println("Default Construncter of current");
	}

	public Currant(int accountNumber, String name, double balance, double overDraftBalance) {
		super(accountNumber, name, balance);
		this.overDraftBalance = overDraftBalance;
		System.out.println("Overloded Constructer of current");
	}
	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			
		return false;
	}
	@Override
	public boolean deposite(double amount) {
		return false;
	}

	public double getOverDraftBalance() {
		return overDraftBalance;
	}

	public void setOverDraftBalance(double overDraftBalance) {
		this.overDraftBalance = overDraftBalance;
	}

	@Override
	public String toString() {
		return "Currant [overDraftBalance=" + overDraftBalance + ", toString()=" + super.toString() + "]";
	}}
