package core_java;

import java.util.*;
public class EvenOddconsecutivenumber {
	public static void main (String[]args)
	{
		int n,odd=0,Even=0,Esum=0,Osum=0;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the value of N");
		n=ab.nextInt();
		while(n>0)
		{
			if(n%2==0)
			{
				Even++;
				Esum=Esum+n;
			}
			else
			{
				odd++;
				Osum=Osum+n;
				
				
			}
			n--;
		}ab.close();
		int avgEven,avgOdd;
		avgEven=Esum/Even;
		avgOdd=Osum/odd;
		
		System.out.println("The average of Even number is "+avgEven);
		System.out.println("The average of Odd number is "+avgOdd);
	}

}
