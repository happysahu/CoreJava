package oops;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.setBase(5);
		t.setHeight(3);
		t.area();
		
		t.setBorderwidth(9);
		
		t.setColor("green");
		
		System.out.println("BorderWidth is "+t.getBorderwidth());
		System.out.println("Color is "+t.getColor());
		System.out.println(t.area());
	}
	
}
