package collectionframwork;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push("harsh");
		s.push('h');
		s.push(2.3);
		s.pop();
		s.peek();
		
		System.out.println(s.peek());
	}

}
