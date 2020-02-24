package lab3;
import java.util.*;
import java.util.Arrays;
public class StringCase
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] s=new String[n];
	for(int i=0;i<n;i++)
	{
		s[i]=sc.next();
	}
	Arrays.sort(s);
	Arrays.toString(s);
	for(int i=0;i<n;i++)
	{
		System.out.println(s[i]);
	}
	if(n%2==0)
	{
		for(int j=0;j<n;j++)
		{
			if (j<n/2)
			{
				s[j]=s[j].toUpperCase();
			}
			else
			{
				s[j]=s[j].toLowerCase();
			}
		}
	}
	else
	{
		for(int j=0;j<n;j++)
		{
			if(j<(n/2+1))
			{
				s[j]=s[j].toUpperCase();
			}
			else
			{
				s[j]=s[j].toLowerCase();
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(s[i]);
	}

}
}


