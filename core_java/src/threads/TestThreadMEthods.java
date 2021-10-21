package threads;

public class TestThreadMEthods extends Thread {
	private String name;

	public TestThreadMEthods() {

	}

	public TestThreadMEthods(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " " + name);
		}
	}

	public static void main(String[] args) {
		TestThreadMEthods m = new TestThreadMEthods("Dhoni");
		TestThreadMEthods m1 = new TestThreadMEthods("Virat");

		Thread t = new Thread(m);
		t.setPriority(10);
		Thread t1 = new Thread(m1);

		t1.setPriority(5);
		

		t.start();
		t1.start();

	}
}
