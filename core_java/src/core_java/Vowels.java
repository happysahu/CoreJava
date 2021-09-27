package core_java;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args)
	{
		
		char ch;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter any Character");
		ch=ss.next().charAt(0);
		 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
	            System.out.println(ch + " is vowel");
		 }
		// else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			// System.out.println(ch + " is vowel");
			 
		// }
	            else {
	            System.out.println(ch + " is consonant");
	            }
			ss.close();
		
	
		
	}


}
