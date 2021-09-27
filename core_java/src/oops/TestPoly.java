package oops;

public class TestPoly {
public static void main(String[] args) {
	Shape[] ss = new Shape[3];
	ss[0]=new Rectranglr(2,3);
	ss[1]=new Circle(2);
	ss[2]=new Triangle(3,2);
	double TotalArea=CalArea(ss);
	System.out.println("total area is "+TotalArea);
}
public static double CalArea(Shape[] ss) {
	double TotalArea=0;
	for(int i=0;i<ss.length;i++) {
		TotalArea += ss[i].area();
		//System.out.println(TotalArea);
	}
	return TotalArea;
}
}
