package lab10;

public class Exercise5 {
 public	int factorial(int a) {
	 
		int c=1;
		for(int i=1;i<=a;i++)
		{
			c=c*i;
		}
		System.out.println("Factorial is "+c);
	return 0;}
	public static void main(String[] args) {
		Exercise5 obj=new Exercise5();
		Fact fr = obj::factorial;
		fr.display(10);
	}
}

interface Fact{
	int display(int a);
}
