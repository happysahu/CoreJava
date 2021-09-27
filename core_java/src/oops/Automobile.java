package oops;

public class Automobile {
private String color;
private int speed;
private String make;
public static final int NO_OF_GARES=4;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public void Break(double a) {
	if(speed>=a) {
		System.out.println("Break"+ (speed-10));
	}
	//else {
		//System.out.println(speed);
	//}
}
public void  Acceleration(double aa) {
	if(speed<aa) {
				
		System.out.println("Accelerate your vehicle "+(speed+10));
	}
	
	
}
public void ChangeGare(int gare) {
	int g;
	g=this.speed;
	int a1=g+15;
	int a2=a1+15;
	int a3=a2+15;
	int a4=a3+15;
	if(gare==1) {
		System.out.println("Speed is "+a1+" Gare is "+gare);
	}
	else if(gare == 2) {
		System.out.println("Speed is "+a2+" Gare is "+gare);
	}
	else if (gare==3) {
		System.out.println("Speed is "+a3+" Gare is "+gare);
	}
	else if(gare==4) {
		System.out.println("Speed is "+a4+" Gare is "+gare);
	}
	else {
		System.out.println("No Need to change gare");
	}
}
}
