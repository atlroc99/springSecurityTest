package com.springSecurityTest.dao;

import java.util.List;

import com.springSecurityTest.entity.Employee;

public interface EmployeeDao {

	void addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployee(Integer id);
}
