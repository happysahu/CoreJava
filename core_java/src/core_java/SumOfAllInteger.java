package core_java;

import java.util.Scanner;

public class SumOfAllInteger {
	public static void main(String[]args) {
		int sum=0,count=0,n,p;
		Scanner pp=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=pp.nextInt();
		System.out.println("Enter the value of p");
		p=pp.nextInt();
		
		
		for(int i=n;i<=p;i++) {
			if(i%7==0)
			{
				sum=sum+i;
				count++;
				
			}
		}
		System.out.println("Sum is :"+sum);
		System.out.println("count is :"+count);
		pp.close();
	}

}
