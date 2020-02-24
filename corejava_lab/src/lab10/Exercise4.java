package lab10;

class Vehicle {
private String name;
private String colour;
private int number;
public Vehicle(String name, String colour, int number) {
	
	this.name = name;
	this.colour = colour;
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
}
public class Exercise4{
	public static void main(String[] args) {
		Vehicle v=new Vehicle("Honda City","Black",123);
		System.out.println(v.getName()+","+v.getColour()+","+v.getNumber());
	}
}
