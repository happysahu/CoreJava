package core_java;

import java.util.Scanner;

public class Table {
	public static void main(String[]args)
	{
		int n;
		Scanner pp=new Scanner(System.in);
		System.out.println("Where do you want the table from 1 to ?");
		n=pp.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=10;j++) {
				int m;
				m=j*i;
				System.out.print(i+" * "+j+" = "+m);
				System.out.println("");
				
			}
			System.out.println("");
			
			
			
		}
		pp.close();
	}

}
