package oops;

public class Circle extends Shape {
public int radius;

public Circle() {
}
public Circle(int r) {
	radius=r;
}

public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public double area() {
	double arr =3.14*radius*radius;
	return arr;
	
}

}
