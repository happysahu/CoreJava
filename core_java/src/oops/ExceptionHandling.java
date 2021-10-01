package oops;

public class ExceptionHandling {
public static void main(String[] args) {
	String q="harsh";
	try{
		int a=15/0;
		
		System.out.println(q.charAt(6));
		
	}catch(IndexOutOfBoundsException e) {
		//System.err.println("gff");
	e.printStackTrace();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
