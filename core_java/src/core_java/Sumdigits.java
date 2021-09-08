package core_java;
import java.util.*;
public class Sumdigits {
	public static void main(String[]args) {
		Scanner r=new Scanner(System.in);
		int m,n,sum=0;
		System.out.println("Enter the digit");
		n=r.nextInt();
		System.out.println("The sum of digit :");
		while(n>0) {
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		r.close();
		System.out.println(sum+"");
		
		
				
		
	}

}
