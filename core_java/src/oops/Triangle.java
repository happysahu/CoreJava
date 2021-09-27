package oops;

public class Triangle extends Shape {
	public int base;
	public int height;
public Triangle() {
}
public Triangle(int a,int b) {
	base=a;
	height=b;
}
	public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
	public double area() {
		double ar=0.5*base*height;
		return ar;
	}
	

}
