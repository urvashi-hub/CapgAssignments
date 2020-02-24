package lab6;
import java.util.*;
import java.lang.Math;
class Modify
{
public int modifyNumber(int num)
{
	String str=Integer.toString(num);
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<str.length();i++)
	{
		if(i!=str.length()-1)
		{
		int a=Math.abs((str.charAt(i+1)-str.charAt(i)));
		/*System.out.println(a);*/
		sb.append(a);
	    }
		else
		{
			int a=Math.abs(str.charAt(i)-str.charAt(0));
			sb.append(a);
		}
	}
	String str1=sb.toString();
	int num1=Integer.parseInt(str1);
    return num1;
}
}
/*public class ModifyNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Modify a=new Modify();
		int num=sc.nextInt();
		int val=a.modifyNumber(num);
		System.out.println(val);
	}
}*/
