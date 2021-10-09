package core_java;

import java.util.Scanner;

public class Table {
	public static void main(String[]args)
	{

		int n;
		Scanner pp=new Scanner(System.in);
		System.out.println("Where do you want the table from 1 to ?");
		n=pp.nextInt();
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=n;j++) {
				int m;
				m=j*i;
				System.out.print(m+"    |    ");
				//System.out.println("");
				
			}
			System.out.println("");
			
			
			
		}
		pp.close();
	}
}
