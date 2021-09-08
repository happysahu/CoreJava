package core_java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		
		char operator;
		do {
		Double n1,n2,Result;
		Scanner rr=new Scanner(System.in);
		System.out.println("Choose an operator");
		operator=rr.next().charAt(0);
		System.out.println("Enter First number" );
		n1=rr.nextDouble();
		System.out.println("Enter Second number" );
		n2=rr.nextDouble();
		switch(operator) {
		    case '+':
		    	Result = n1+n2;
				System.out.println(n1+"+"+n2+"="+Result);
			    break;
			case '-':
			    Result = n1-n2;
			    System.out.println(n1+"-"+n2+"="+Result);
			    break;
			case '*':
				Result = n1*n2;
				System.out.println(n1+"*"+n2+"="+Result);
				break;
			case '/':
				Result = n1/n2;
				System.out.println(n1+"/"+n2+"="+Result);
				break;
			default:
				System.out.println("Invalid operator!");
				break;
						  }
		System.out.println("Do you want to continue(Y/N)");
		 operator =rr.next().charAt(0);
		 
		}
		while(operator=='y'||operator=='Y');
		}
	
		}	


