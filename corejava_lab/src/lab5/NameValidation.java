package lab5;
import java.util.Scanner;

 class FnameIsEmptyException extends Exception 
{
	String errorMessage;
	public FnameIsEmptyException(String errorMessage)
	{
		this.errorMessage=errorMessage;
	}
	public String toString() {
		return errorMessage;
	}
}
 class LnameIsEmptyException extends Exception
{
	String eMessage;
	public LnameIsEmptyException(String eMessage)
	{
		this.eMessage=eMessage;
	}
	public String toString() {
		return eMessage;
	}
}

public class NameValidation {
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first name");
	String fname=sc.next();
	System.out.println("enter last name");
	String lname=sc.next();
	try
	{
		if(fname.equals(" "))
			throw new FnameIsEmptyException("Fname cannot be empty");	
		else if(lname.equals(" "))
			throw new LnameIsEmptyException("Fname cannot be empty");
		System.out.println("Welcome "+fname+"  "+lname+"!");
	}
	catch(FnameIsEmptyException ex)
	{
		System.out.println(ex);
	}
	catch(LnameIsEmptyException ex)
	{
		System.out.println(ex);
	}
}
}
