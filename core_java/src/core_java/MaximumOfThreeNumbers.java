package core_java;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
	public static void main(String[]args) {
		int a,b,c;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=hs.nextInt();
		System.out.println("Enter value of b");
		b=hs.nextInt();
		System.out.println("Enter value of c");
		c=hs.nextInt();
		if(a>b&a>c) {
			System.out.println("largest number is "+a);
		}
		else if(b>a&b>c)
		{
			System.out.println("Largest number is "+b);
		}
		else
		{
			System.out.println("Largest number is "+c);
		}
hs.close();
}
}


