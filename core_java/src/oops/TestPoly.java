package oops;

public class TestPoly {
public static void main(String[] args) {
	Circle c=new Circle();
	c.setRadius(2);
	Rectranglr r=new Rectranglr();
	r.setLength(2);
	r.setWidth(3);
	Triangle t=new Triangle();
	t.setBase(2);
	t.setHeight(4);
	Shape[] ss = new Shape[3];
	ss[0]=c;
	ss[1]=r;
	ss[2]= t;
	
	double TotalArea=CalArea(ss);
	System.out.println("total area is : "+TotalArea);
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
