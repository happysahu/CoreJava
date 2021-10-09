package oops;

public class ExceptionQ5 {
public static void main(String[] args) {
	int[] a= {1,2,3,4};
	String s="harsh";
	String s1=null;
	try{
		System.out.println(a[4]);
		System.out.println(s.charAt(10));
	
	if(s1.equals("ygg"))
	System.out.println(s1);
	}catch(IndexOutOfBoundsException e) {
		e.printStackTrace();
	}catch(NullPointerException e) {
		e.printStackTrace();
	}
}
}
