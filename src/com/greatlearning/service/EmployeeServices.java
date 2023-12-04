package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeServices {
	String generateEmailId(String fname,String lname,String deptName);
	String generatePassword();
	void showEmployeeDetails(Employee e);
}
