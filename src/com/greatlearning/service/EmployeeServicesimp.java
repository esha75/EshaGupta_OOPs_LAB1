package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServicesimp implements EmployeeServices {

	@Override
	public String generateEmailId(String fname, String lname, String deptName) {
		
		return fname+lname+"@"+deptName+".greatlearning.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";//26
		String lower="abcdefghijklmnopqrstuvwxyz";//26
		String num="1234567890";//10
		String splecharater="!@#$%^&*()";//10
		String combined=caps+lower+num+splecharater ;//72
		String mypassword="";
		Random random=new Random();
		for (int i=1;i<=8;i++) {
			mypassword=mypassword+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return mypassword ;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		
		System.out.println("Your First Name is : "+ e.getFirstname());
		System.out.println("Your Last Name is : "+ e.getLastname());
		System.out.println("Your Email Address is : "+ e.getEmail());
		System.out.println("Your Password is : "+ e.getPassword());
		
	}

}
