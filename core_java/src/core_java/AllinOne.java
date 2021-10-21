package core_java;

import java.util.Random;
import java.util.Scanner;

public class AllinOne {
	public static void main(String[]args) {
		char operator;
		Scanner hs=new Scanner (System.in);
		do {
		
		
		System.out.println("Choose a program");
		System.out.println("A = Prime Number \nB = Area of circle \nC = Reverse Digit\nD = Maximum Of Three Numbers\nE = Factorial\nF = Triangle\nG = Fibonacci Series\nH = Table\nI = Random Integer\nJ = Sum of numbers\nK = Sum of all integer divisible by 7\nL = Armstrong number\n"
				+ "M = Palindrome  \nN = Vowel");
		operator=hs.next().charAt(0);
			switch(operator) {
		case 'A':
						int i=2,n;
						System.out.println("Enter the value of n");
						n=hs.nextInt();
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
						break;
		case 'B':
			double area,r;
			System.out.println("enter the radius");
			r=hs.nextDouble();
			area=3.14*r*r;
			System.out.println("Area of circle "+area);
			break;
		case'C':
			 int a,p,s=0;
			 System.out.println("enter the value of n");
			 a=hs.nextInt();
			 while(a>0)
			 {
				 p=a%10;
				 s=(s*10)+p;
				a=a/10;
			 }
			  System.out.println(" Reverse number is "+s);
			 break;
		case'D':
			int aa,b,c;
			System.out.println("Enter value of a");
			aa=hs.nextInt();
			System.out.println("Enter value of b");
			b=hs.nextInt();
			System.out.println("Enter value of c");
			c=hs.nextInt();
			if(aa>b&aa>c) {
				System.out.println("largest number is "+aa);
			}
			else if(b>aa&b>c)
			{
				System.out.println("Largest number is "+b);
			}
			else
			{
				System.out.println("Largest number is "+c);
			}
			break;
		case 'E':
				int k;
				int fact=1;
				System.out.println("Enter the number");
				k=hs.nextInt();
			for( i=1;i<=k;i++) {
					fact=	fact*i;
				}
				System.out.println(k+" factroial is "+fact);
					break;
		case 'F':
			int ij,j;
			System.out.println("Triangle");
			for(j=1;j<=5;j++)
			{
				for(ij=1;ij<=j;ij++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			break;
		case 'G':
			int as=-1,bs=1,cs,nm;
			System.out.println("Enter the number");
			nm=hs.nextInt();
			System.out.println("Fibonacci Series");
			for(i=0;i<nm;i++) {
				cs=as+bs;
				System.out.print(" "+cs);
				as=bs;
				bs=cs;
				System.out.println();//for line change
				}
			break;
		case 'H':
			int nh;
			
			System.out.println("Where do you want the table from 1 to ?");
			nh=hs.nextInt();
			for(int ih=1;ih<=nh;ih++) {
				for(int jh=1;jh<=10;jh++) {
					int m;
					m=jh*ih;
					System.out.print(ih+" * "+jh+" = "+m);
					System.out.println("");
					
				}
				System.out.println("");
				
				
				
			}
			break;
		case 'I':
			int ii;
			Random rnum=new Random();
			System.out.println("Random number");
			for(ii=0;ii<5;ii++)
			{
				System.out.println(rnum.nextInt(100));
			}
			break;
		case 'J':
			int m,nj,sum=0;
			System.out.println("Enter the digit");
			nj=hs.nextInt();
			System.out.println("The sum of digit :");
			while(nj>0) {
				m=nj%10;
				sum=sum+m;
				nj=nj/10;
			}
			System.out.println(sum+"");
			break;
		case 'K':
			int sk=0,ck=0,nk,pk;
			Scanner pp=new Scanner(System.in);
			System.out.println("Enter the first value");
			nk=pp.nextInt();
			System.out.println("Enter the last value");
			pk=pp.nextInt();
			for(int ik=nk;ik<=pk;ik++) {
				if(ik%7==0)
					{
					sk=sk+ik;
					ck++;
					}
			}
			System.out.println("Sum is :"+sk);
			System.out.println("count is :"+ck);
			break;
		case 'L':
			int number;
			int cl,rl,sl=0;
			System.out.println("Enter the number to be verified:");
				number=hs.nextInt();
			cl=number;
			while(cl!=0) {
				rl=cl%10;
				sl=sl+(rl*rl*rl);
				cl=cl/10;
			}
				if(sl==number) {
					System.out.println("Given number is armstrong number");
							  }
				else {
					System.out.println("Given number is not armstrong number");
				     }
			break;
		case 'M':
			int num,rm,sm=0,temp;
			 
			 System.out.println("enter value of n");
			  num=hs.nextInt();
			 
			temp=num;
			while(num>0) {
			  rm=num%10;   
			   sm=(sm*10)+rm;    
			   num=num/10;  
			}
			      
			  if(temp==sm) {   
			   System.out.println("palindrome number ");    
			  }
			  else 
			  {
			  System.out.println("not palindrome");
			  }
			break;
		case 'N':
			char ch;
			
			System.out.println("Enter any Character");
			ch=hs.next().charAt(0);
			 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		            System.out.println(ch + " is vowel");
			 }
			 else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				 System.out.println(ch + " is vowel");
				 
			 }
		            else {
		            System.out.println(ch + " is consonant");
		            }
			break;
			default:
				System.out.println("Invalid choice!");
				break;
		}
			System.out.println("Do you want to continue(Y/N)");
					operator =hs.next().charAt(0);
		}
			while(operator=='y'||operator=='Y');
		System.out.println("Good bye");
		hs.close();
		}
	
}
