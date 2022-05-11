package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.Service.Notification;
import com.mindgate.ServiceFactory.SerFactory;
import com.mindgate.pojo.SmsNotification;

public class NotificationApplicationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String to;
		String message;
		int choice;
		System.out.println("1. SMS notifiaction");
		System.out.println("2. Gmail notifiaction");
		System.out.println("3. WhatsApp notifiaction");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		System.out.println("Enter contact::");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("Enter message");
		message = scanner.nextLine();
		
		
		Notification notification = SerFactory.getNotification(choice);
		notification.sendNotification(to, message);
	}

}
