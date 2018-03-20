package com.springSecurityTest.service;

import java.util.List;

import com.springSecurityTest.entity.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployee(Integer id);
}
