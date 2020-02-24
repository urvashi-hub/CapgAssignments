package lab1;
public class Power2 {
	public boolean checkNumber(int n) {
	int a= (n/2);
	if(a%2==0)
	return true;
	else
		return false;}
	
	public static void main(String[] args) {
		Power2 a = new Power2();
		boolean val=a.checkNumber(190);
		if(val==true)
			System.out.println("Number is in power of 2");
		else
			System.out.println("Number not in power of 2");
	}
}