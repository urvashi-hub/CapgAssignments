package lab4;
import java.lang.Math;
public class CubicSum{
public int sum(int n){
	int sum=0;
	while(n>0) {
		int a=n%10;
		sum=(int) (sum+Math.pow(a,3));
		n=n/10;
	}
	return sum;
}
public static void main(String[] args) {
	CubicSum s=new CubicSum();
	int value=s.sum(789);
	System.out.println(value);
}
}
