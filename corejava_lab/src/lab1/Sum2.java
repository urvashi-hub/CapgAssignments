package lab1;
public class Sum2 {

	
	int sum=0;
	public int calculateSum(int n) { 
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
				sum=sum+i;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args)
	{
		Sum2 a=new Sum2();
		int sum1= a.calculateSum(10);
		
		System.out.println(sum1);
	}
	
	
}
