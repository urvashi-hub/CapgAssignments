package lab5;
import java.util.Scanner;
public class Prime
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//int c=2;
	boolean a=true;
	for(int i=2;i<=n;i++)
	{
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			a=false;
			break;
		}
	}
	if(a==true)
	{
		System.out.println(i);
	}
}
}
}
