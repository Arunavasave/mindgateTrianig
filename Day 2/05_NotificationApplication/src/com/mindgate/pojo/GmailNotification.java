package com.mindgate.pojo;

import com.mindgate.Service.Notification;

public class GmailNotification implements Notification{
	 
			public void sendNotification(String to,String message) {
				System.out.println("sending to sms notification");
				System.out.println("to::"+to);
				System.out.println("Message::"+message);
			}
	
	

}
