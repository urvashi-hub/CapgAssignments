package lab3;
public class CountChar 
{
public static void getCount(char[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		char c=arr[i];
		for(int j=0;j<arr.length;j++)
		{
			if(c!=(char)0) {
			if(c==arr[j])
			{
				count++;
				arr[j]=(char)0;
			}
			}
		}
		if(count>0)
		{
		System.out.println("character  is "+c+" count is "+count);
	}
	}
}
public static void main(String args[])
{
	char[] arr= {'a','b','c','b','a'};
	getCount(arr);
}
}
