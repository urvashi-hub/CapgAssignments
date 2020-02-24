package lab1;
public class Increasingnum {
	public boolean checkNumber(int n) {
		int max=9;
		while(n>0) {
			int a=n%10;
			if(a>max)
				return false;
			else {
				max=a;
			n=n/10;} 
		}return true;
	}
	public static void main(String[] args) {
		Increasingnum inc= new Increasingnum();
		boolean val=inc.checkNumber(123456789);
		if(val==true)
			System.out.println("Number is Increasing");
		else
			System.out.println("Number is not increasing");
	}
}