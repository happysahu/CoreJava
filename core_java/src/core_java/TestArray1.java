package core_java;

public class TestArray1 {
	public static void main(String[] args) {
		int[][] a= new int[10][10];
		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j <= a.length; j++) {
				System.out.print("\t ");
				System.out.print((i+1)*j);
			}System.out.println(" ");
		}
	}
}
