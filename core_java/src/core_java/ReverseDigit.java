package core_java;

import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[]args) {
		
	
	 Scanner ob=new Scanner(System.in);
	 int n,r,s=0;
	 System.out.println("enter the value of n");
	 n=ob.nextInt();
	 while(n>0)
	 {
		 r=n%10;
		 s=(s*10)+r;
		n=n/10;
	 }
	 ob.close();
	 System.out.println(" Reverse number is "+s);
	}
}
