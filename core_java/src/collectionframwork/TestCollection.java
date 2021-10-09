package collectionframwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class TestCollection {
	public static void main(String[] args ) {
		LinkedList a=new LinkedList();
		a.add(1);
		a.add(4);
		a.add(2);
		a.add(3);
		
		a.add('h');
		a.add(2.37);
		a.add("harsh");
		System.out.println(a.subList(1, 3));
	
		
		//a.clear();
		
		System.out.println(a);
		LinkedList a1=new LinkedList();
		a1.add(123);
		a1.add('h');
		a1.add(1);
		a1.add(4);
		a1.add(2);
		a1.add(3);
		//a1.addAll(a);
		
		System.out.println(a1);
		a.retainAll(a1);
		//System.out.println(a1.containsAll(a));
		//System.out.println(a1.isEmpty());
		System.out.println(a1);
		System.out.println(a1.size());
	}

}
