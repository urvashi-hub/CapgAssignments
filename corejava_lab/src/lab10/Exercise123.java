package lab10;
interface PowerOf{
	double powerOf(double a,double b);
	
}
interface Space{
	String space(String a);
}
interface UserP{
	boolean userp(String a,String b);
}

public class Exercise123 {
public static void main(String[] args) {
	PowerOf p=(a,b)->Math.pow(a, b);
	System.out.println(p.powerOf(3,2));
	
	Space sp=(a)->a.replace("", " ").trim();
	System.out.println(sp.space("Urvashi"));
	
	UserP up=(a,b)->(a=="Urvashi" && b=="Black");
	System.out.println(up.userp("Urvashi", "Black"));//true case
	System.out.println(up.userp("Urvashi", "Shikha"));//false case
}
}