package core_java;

import java.util.Scanner;

public class AOC {
	public static void main (String[]args)
	{
		
		Scanner kb=new Scanner(System.in);
		double area,r;
		
		System.out.println("enter the radius");
		r=kb.nextDouble();
		area=3.14*r*r;
		System.out.println("Area of circle "+area);
		kb.close();
		
	
	}
	

}
