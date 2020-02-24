package lab5;
import java.util.Scanner;
public class Fibonacci 
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	static int fib(int n)
	{
	if(n==1)
	{
		return 0;
	}
	else if(n==2)
	{
		return 1;
	}
	else
	{
		return fib(n-1)+fib(n-2);
	}
    }
	public static void main(String args[])
	{
		int x=fib(5);
	System.out.println(x);
}
}
