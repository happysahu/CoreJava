package core_java;

import java.util.Scanner;

public class Table {
	public static void main(String[]args)
	{
		int n;
		Scanner pp=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=pp.nextInt();
		for(int i=1;i<=10;i++) {
			
			int m;
			m=n*i;
			System.out.println(""+m);
			
		}
		pp.close();
	}

}
