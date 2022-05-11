package com.mindgate.pojo;

import com.mindgate.Service.Notification;

public class WhatsAppNotification implements Notification {
	
		 
		public void sendNotification(String to,String message) {
			System.out.println("sending to Whatsapp notification");
			System.out.println("to::"+to);
			System.out.println("Message::"+message);
		}

}
