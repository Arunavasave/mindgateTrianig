package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {
public static void main(String[] args) {
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
	Address address = applicationContext.getBean("address", Address.class);
	address.setAddressId(101);
	address.setCity("Mumbai");
	address.setState("maharashtra");
	address.setStreet("m g road");
	
	System.out.println(address);
	
	System.out.println("-".repeat(11));
	
	Employee employee = applicationContext.getBean("employee", Employee.class);
	employee.setEmployeeId(101);
	employee.setName("Aruna");
	employee.getSalary();
	employee.setHomeAddress(address);
	System.out.println(employee);
}
}
