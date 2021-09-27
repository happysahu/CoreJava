package core_java;

import java.util.Scanner;

public class ExtractLastName {

	public static void main(String[] args) {
		Scanner hs=new Scanner(System.in);
		String s;
		System.out.println("Enter your full name");
		s=hs.nextLine();
		String  st[]=s.split(" ");
		
		System.out.println("Last name is -> "+st[st.length-1]);
		
		hs.close();
	}

}
