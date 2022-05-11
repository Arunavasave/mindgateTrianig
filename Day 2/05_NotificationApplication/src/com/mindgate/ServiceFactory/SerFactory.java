package com.mindgate.ServiceFactory;
import com.mindgate.Service.Notification;
import com.mindgate.pojo.GmailNotification;
//import com.mindgate.pojo.Circle;
import com.mindgate.pojo.SmsNotification;
import com.mindgate.pojo.WhatsAppNotification;


//loose couplig
public class SerFactory {
	public static Notification getNotification(int choice) {
	Notification notification= null;
		
		switch (choice) {
		case 1:notification = new SmsNotification();
		break;
			
		case 2:notification = new GmailNotification();
			
			break;
		case 3:notification = new WhatsAppNotification();
			break;
	
//			default:
//				shapes = new Shapes();
//				break;
				}

		return notification;
	}
	}


