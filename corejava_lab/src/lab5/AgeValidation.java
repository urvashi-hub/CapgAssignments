package lab5;

import java.util.Scanner;

class AgeIsInvalidException extends Exception 
{
	String errorMessage;
	public AgeIsInvalidException(String errorMessage)
	{
		this.errorMessage=errorMessage;
	}
	public String toString() {
		return errorMessage;
	}
}
public class AgeValidation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	
	try
	{
		if(age<15)
			throw new AgeIsInvalidException("Invalid age");	
		System.out.println("Your age is valid for the purpose");
}
	catch(AgeIsInvalidException ex)
	{
		System.out.println(ex);
	}
}
}
