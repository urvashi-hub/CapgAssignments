package com.cg.eis.exception;

import java.util.Scanner;


class SalaryLessThan3000Exception extends Exception{
	String errorMessage;
	public SalaryLessThan3000Exception(String errorMessage)
	{
		this.errorMessage=errorMessage;
	}
	public String toString() {
		return errorMessage;
	}
}
public class EmployeeException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		try
		{
			if(salary<=3000)
				throw new SalaryLessThan3000Exception("Salary less than or equal to 3000");	
			System.out.println("your salary is "+salary);
	}
		catch(SalaryLessThan3000Exception ex)
		{
			System.out.println(ex);
		}
}
}
