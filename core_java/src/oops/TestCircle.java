package oops;

public class TestCircle {
	public static void main(String[] args) {
		Circle h=new Circle();
		h.setRadius(5);
		h.setColor("Red");
		h.setBorderwidth(5);
		h.area();
		
		System.out.println(h.area());
		System.out.println(h.getBorderwidth());
		System.out.println(h.getColor());
		
	}
}
