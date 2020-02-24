package lab1;
public class Diff {
	int sum=0, sum1=0, diff=0, sum2=0;
	public int calculateDifference(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			sum1= sum1+(i*i);
		}
		sum2= (sum*sum);
		diff= sum2-sum1;
		return diff;
	}
	
public static void main(String[] args) {
	Diff a= new Diff();
	int c= a.calculateDifference(3);
	System.out.println(c);
}
}