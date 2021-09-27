package core_java;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String s;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter any String");
		s=ss.nextLine();
	
		for(int i=s.length();i>0;i--) {
			System.out.print(s.charAt(i-1));
		}
		System.out.println("\nReverse String");
		
		ss.close();
	}
}
