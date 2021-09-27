package oops;


public class Constructor {
	
	public String color;
	public int BorderWidth;
	public int c;
	public Constructor() {
		System.out.println("This is default");
		
			}
	public Constructor(int x,int y) {
		c=x+y;
	}
	public Constructor(String color,int BorderWidth) {
	this.color=color;
	this.BorderWidth=BorderWidth;
	}
	public static void main(String[] args) {
		Constructor s1=new Constructor("red",7);
		System.out.println(s1.color);
		System.out.println(s1.BorderWidth);
		Constructor s2=new Constructor(2,3);
		System.out.println(s2.c);
		
		
	}

}
