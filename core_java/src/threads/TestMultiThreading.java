package threads;

public class TestMultiThreading {
	
	public static void main(String[] args) {
		MultiThreading r=new MultiThreading("harsh");
		MultiThreading r1=new MultiThreading("virat");
		Thread t=new Thread(r);
		Thread t2=new Thread(r1);
		
		t.start();
		t2.start();
		
	}
}
