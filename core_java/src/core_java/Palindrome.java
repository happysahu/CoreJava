
package core_java;

import java.util.Scanner;

public class Palindrome {
	public static void main (String[]args) {
		int n,r,sum=0,temp;
		 Scanner ob=new Scanner(System.in);
		 System.out.println("enter value of n");
		  n=ob.nextInt();
		 
		temp=n;
		while(n>0) {
		  r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;  
		}
		      
		  if(temp==sum) {   
		   System.out.println("palindrome number ");    
		  }
		  else 
		  {
		  System.out.println("not palindrome");
		  }
		  ob.close();
			  
	}

	}


