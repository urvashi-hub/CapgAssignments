package lab3;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;
class StringReverse
{
	
	public static int[] getSorted(int[] arr)
	{
		StringBuilder sb=new StringBuilder();
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
			sb=sb.reverse();
			arr1[i]=Integer.parseInt(sb.toString());
			sb.setLength(0);
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr1[i]);
		}
		Arrays.sort(arr1);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr1[i]);
		}
		return arr1;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		getSorted(arr);
	}
}


