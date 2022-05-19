package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDaoInterface;
import com.mindgate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDaoInterface employeeDaoInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inside EmployeeService addNewEmployee");
		System.out.println(employee);
		return employeeDaoInterface.addNewEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDaoInterface.getAllEmployee();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeDaoInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDaoInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeDaoInterface.deleteEmployeeByEmployeeId(employeeId);
	}

}
