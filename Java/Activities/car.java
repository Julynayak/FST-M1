package activities;

public class car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public car() {
		tyres=4;
		doors=4;
	}
	public void display() {
		System.out.println(color);
		System.out.println(transmission);
		System.out.println(make);
		System.out.println(tyres);
		System.out.println(doors);
		
	}
	
	public void accelerate() {
		System.out.println("car is running");
	}
public void brake() {
	System.out.println("car is stopped");
	}

}
