package core_java;

import java.util.Scanner;

public class primenumber {
	public static void main(String[]args)
	{
		
		 Scanner ob=new Scanner(System.in);
		 int n;
		 System.out.println("enter the value of n");
		 n=ob.nextInt();
		int i=2;
	boolean flag=false;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			flag=true;
			break;
		}
		i++;
	}
		if(!flag)
	{
			System.out.println(n+" is a prime number. ");
		}
		else
		{
			
			System.out.println(n+" is not a prime number. ");
		}
		ob.close();
}
	}	
	 
	       
