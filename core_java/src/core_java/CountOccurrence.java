package core_java;

public class CountOccurrence {
	public static void main(String[] args) {
		String s="Harsh sahu";
		char c='H';
		int count=0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
