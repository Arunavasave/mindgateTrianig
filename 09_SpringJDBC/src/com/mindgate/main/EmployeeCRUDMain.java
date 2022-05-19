package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "xyz", 100);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//insert
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		if (result) {
//			System.out.println("Employee added successfully");
//
//		} else {
//			System.out.println("failed to add new Employee");
//		}
		
		//select
		List<Employee> Allemployee = employeeServiceInterface.getAllEmployee();
		for (Employee employee2 : Allemployee) {
			System.out.println(employee2);
		}
		
		System.out.println("-".repeat(50));
		
		Employee Aruna =employeeServiceInterface.getEmployeeByEmployeeId(41);
		System.out.println(Aruna);
		
		Employee employee2 = new Employee(41, "Spring JDBC", 30000);
		boolean result =employeeServiceInterface.updateEmployee(employee2);
		if(result) {
			System.out.println("Employee updated successfully");
			
		}
		else {
			System.out.println("failed to update");
		}
	}

}
