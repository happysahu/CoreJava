package oops;

public class AddOverloading {
	public void Add(int x,int y) {
		System.out.println(x+y);
	}
	public void Add(int x,float y) {
		System.out.println(x+y);
	}
	public void Add(float x,int y) {
		System.out.println(x+y);
	}
	public void Add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
}
