package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println("Application context is created");
		Address address = applicationContext.getBean("address",Address.class);
		
		address.setAddressId(101);
		address.setCity("Mumbai");
		address.setState("maharashtra");
		address.setStreet("m g road");
		System.out.println(address);
		
		Employee employee = applicationContext.getBean("employee", Employee.class);
		employee.setEmployeeId(101);
		employee.setName("Aruna");
		employee.getSalary();
		employee.setHomeAddress(address);
		System.out.println(employee);
		
	}

}
