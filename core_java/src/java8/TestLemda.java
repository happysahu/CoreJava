package java8;

public class TestLemda {

	public static void main(String[] args) {

		/*
		 * Lemda l = new Lemda() {
		 * 
		 * @Override public void add(int a, int b) { System.out.println(a + b);
		 * 
		 * } }; l.add(10, 10);
		 */
		Lemda l=(a,b)->{System.out.println(a+b);
		};l.add(10, 10);
		}
	}

