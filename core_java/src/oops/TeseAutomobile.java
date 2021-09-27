package oops;

public class TeseAutomobile {
	public static void main(String[] args) {
		Automobile a1=new Automobile();
		System.out.println("Number of gare is -> "+Automobile.NO_OF_GARES);
		a1.setSpeed(40);
		System.out.println("Current Speed is -> "+a1.getSpeed());
		a1.setColor("Red");
		System.out.println("Color is -> "+a1.getColor());
		a1.setMake("Ford");
		System.out.println("Company is -> "+a1.getMake());
		a1.Break(40);
		
		
		a1.Acceleration(40);
		a1.ChangeGare(4);
		
		
	}

}
