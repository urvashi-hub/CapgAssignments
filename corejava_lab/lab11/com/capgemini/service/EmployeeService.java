package com.capgemini.service;

import java.util.Set;

import com.capgemini.bean.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee e);
	Set<Employee> AllEmployee();
	String scheme(float salary,String designation);
	

}
