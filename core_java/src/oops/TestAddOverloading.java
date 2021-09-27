package oops;

public class TestAddOverloading {
	public static void main(String[] args) {
	AddOverloading s1=new AddOverloading();
	s1.Add(3, 2);
	s1.Add(3.4f, 4);
	s1.Add(2, 3.4f);
	s1.Add(2, 2, 3);
}
}
