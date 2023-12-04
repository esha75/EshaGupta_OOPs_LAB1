package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServicesimp;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServicesimp empImpl=new EmployeeServicesimp();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter Your First Name");
		String firtname=sc.next();
		
		System.out.println("Please Enter Your Last Name");
		String lastname=sc.next();
		
		System.out.println("\n  Department Are:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		System.out.println("Please Write Your Choice:");
		int choice =sc.nextInt();
		String genEmail="";
		String genPassword="";
		
		switch(choice) {
		case 1: 
			genEmail=empImpl.generateEmailId( firtname.toLowerCase(), lastname.toLowerCase(),"tech");
			break;
		case 2: 
			genEmail=empImpl.generateEmailId( firtname.toLowerCase(), lastname.toLowerCase(),"admin");
			break;
		case 3: 
			genEmail=empImpl.generateEmailId( firtname.toLowerCase(), lastname.toLowerCase(),"hr");
			break;
		case 4:
			genEmail=empImpl.generateEmailId( firtname.toLowerCase(), lastname.toLowerCase(),"legal");
			break;
		default:
			System.out.println("Please Enter Correct Value.");
		}
		genPassword=empImpl.generatePassword();
		/*System.out.println("Your Email ID is: "+ genEmail);
		System.out.println("Your Password is :"+ genPassword);*/
		Employee e1=new Employee();
		e1.setFirstname(firtname);
		e1.setLastname(lastname);
		e1.setEmail(genEmail);
		e1.setPassword(genPassword);
		
		empImpl.showEmployeeDetails(e1);
		sc.close();
	}

}
