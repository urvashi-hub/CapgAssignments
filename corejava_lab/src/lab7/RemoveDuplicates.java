package lab7;
import java.util.*;
public class RemoveDuplicates 
{
	public int[] modifyArray(int[] n)
	{
		int j=0;
		int[] temp=new int[n.length];
		if(n.length==0|n.length==1)
		{
			return n;
		}
		for(int i=0;i<n.length-1;i++)
		{
			if(n[i]!=n[i+1])
			{
				temp[j++]=n[i];
			}
		}
		temp[j++]=n[n.length-1];
		return temp;
	}
}
