package core_java;

public class StringLitralPool {
	public static void main(String[] args) {
		String s1="Statement";
		String s2="Statement";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String p1= new String("Welcome");
		String p2 =new String("Welcome");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
