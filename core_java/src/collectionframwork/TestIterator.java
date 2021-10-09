package collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;



public class TestIterator {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("java");
		a.add(2); 
		Iterator i=a.iterator() ;
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
		
	}

}
