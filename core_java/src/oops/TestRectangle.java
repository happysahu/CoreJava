package oops;

public class TestRectangle {
	public static void main(String[] args) {
		Rectranglr r=new Rectranglr();
		r.setBorderwidth(7);
		r.setColor("blue");
		r.setLength(5);
		r.setWidth(5);
		r.area();
		System.out.println(r.area());
		System.out.println(r.getBorderwidth());
		System.out.println(r.getColor());
	}

}
