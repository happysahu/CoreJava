package core_java;

import java.util.*;

public class Armstrong {

	public static void main (String[]args)
	{
		int number ;
		int c,r,s=0;
		System.out.println("Enter the number to be verified:" );
      Scanner ob=new Scanner(System.in);
      number=ob.nextInt();
      c=number;
      while(c>0)
      {
    	  r=c%10;
    	  s=s+(r*r*r);
    	  c=c/10;
      }
      if(s==number)
      {
    	  System.out.println("given number is armstrong number.");
      }
      else
      {
    	  System.out.println("given number is not armstrong number.");
      } 
      ob.close();
		
		}
      
      
      
      
	
	}
	

     
     
 

		
	
		

		
	

		
	
	
	
	


