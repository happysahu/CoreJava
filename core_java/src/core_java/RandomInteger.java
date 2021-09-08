package core_java;

import java.util.Random;

public class RandomInteger {
	public static void main(String[]args) {
		int i;
		Random rnum=new Random();
		System.out.println("Random number");
		for(i=1;i<=5;i++)
	
		{
			System.out.println(rnum.nextInt(100));
		}
		
	}

}
