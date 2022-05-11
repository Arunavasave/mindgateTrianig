package com.mindgate.main;

import com.mindgate.pojo.Currant;

public class AccountApplicationMainV6 {
	public static void main(String[] args) {
		Currant currant = new Currant(101, "Aruna", 10000, 50000);
		
		System.out.println(currant);
		System.out.println("withdraw: 5000"); //overdraft valur:50000 and bal 5000
		System.out.println(5000);
		System.out.println(currant);
		
		System.out.println();
		
		System.out.println("withdraw: 20000");
		System.out.println(20000);
		System.out.println(currant);
		
		System.out.println();
		
		System.out.println("deposite: 5000");
		System.out.println(5000);
		System.out.println(currant);
		
		System.out.println();
		
		System.out.println("deposite: 5000");
		System.out.println(5000);
		System.out.println(currant);
		
		System.out.println();

	}
}
