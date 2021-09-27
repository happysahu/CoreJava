package core_java;

import java.util.Scanner;

public class ReverseStringOwnPlace {
	public static void main(String[] args) {
		String s1;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter any string");
		s1=ss.nextLine();
		String [] st = s1.split(" ");
		System.out.print("Reverse String in own place is :- ");
		for (String string : st) {
			for(int i=string.length();i>0;i--) {
				System.out.print(string.charAt(i-1));
			}
			System.out.print(" ");
			
		}
		ss.close();
	}
	}




