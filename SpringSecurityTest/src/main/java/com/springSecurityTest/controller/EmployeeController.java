package com.springSecurityTest.controller;

import java.util.List;

import com.springSecurityTest.entity.Employee;

public class EmployeeController {


	public String addEmployee(Employee employee){
		return "toEmployee list page";
	}
	
	public String getAllEmployees(){
		return "employeeListpage";
	}
	
	public String getEmployeeById(Integer id){
		return "return to employee list page";
	}
	
	public String deleteEmployee(Integer id){
		return "return to employee list page";
	}
	
}
