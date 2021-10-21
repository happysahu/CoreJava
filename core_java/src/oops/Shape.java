package oops;

public abstract class Shape extends TestPoly {
	public String color;
	public int Borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {	
		this.color = color;
	}
	
	public int getBorderwidth() {
		return Borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		Borderwidth = borderwidth;
	}
	public abstract double area() ;
	
	
	public static void main(String[] args) {
		Shape s=new Circle();
		Shape s1=new Rectranglr();
		Shape s2=new Triangle();
		
		s.setBorderwidth(5);
		s.setColor("Red");
		s1.setBorderwidth(6);
		s1.setColor("Blue");
		s2.setBorderwidth(7);
		s2.setColor("Green");
		s.area();
		System.out.println("Area of Circle "+s.area());
		System.out.println("Color and Borderwidth of Circle is : ");
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		s1.area();
		System.out.println("Area of Rectangle "+s1.area());
		System.out.println("Color and Borderwidth of Rectangle is : ");
		System.out.println(s1.getColor());
		System.out.println(s1.getBorderwidth());
		s2.area();
		System.out.println("Area of Triangle "+s2.area());
		System.out.println("Color and Borderwidth of triangle is : ");
		System.out.println(s2.getColor());
		System.out.println(s2.getBorderwidth());
		
	}
	
	
}
