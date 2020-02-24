package lab5;
import java.util.Scanner;
public class Traffic 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("Enter 1 for red");
	System.out.println("Enter 2 for yellow");
	System.out.println("Enter 3 for green");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("STOP");
		break;
	case 2:
		System.out.println("READY");
		break;
	case 3:
		System.out.println("GO AHEAD");
		break;
     }
}
}
}
