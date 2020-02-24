package lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the line of integers separated by ,");
	String str=sc.next();
	int sum=0;
	
	StringTokenizer st=new StringTokenizer(str,","); 
	while(st.hasMoreTokens())
		{String temp = st.nextToken();
    int n = Integer.parseInt(temp);
    System.out.println(n);
    sum = sum + n;
}
	System.out.println("sum = "+sum);
}
}