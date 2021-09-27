package oops;

public class Rectranglr extends Shape {
	public int length;
	public int width;
	public Rectranglr() {
		
	}
	public Rectranglr(int l,int w) {
		length=l;
		width=w;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		double rr=this.length*this.width;
		return rr;
	}
	
}
