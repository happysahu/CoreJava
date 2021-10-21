package collectionframwork;

import java.util.ArrayList;
import java.util.HashSet;

public class ExQ5 {
	public static void main(String[] args) {
		int c;
		double l=0;
		double l1=0;
		double s;
		ArrayList a1 = new ArrayList();

		ArrayList a = new ArrayList();
		for (int i = 0; i < 100000; i++) {
			a.add(i);
			l=System.currentTimeMillis();
			
		}
		//System.out.println("Time is "+l);

		HashSet h = new HashSet(a);
		h.addAll(a);
		System.out.println("Hashset"+h);
//		for (int j = 0; j < 50; j++) {
//			c=(int)(Math.random()*h.size());
//			//System.out.println(j+" : "+c);
//			a1.add(c);
//			l1=System.currentTimeMillis();
//			
//		}
		
	//	System.out.println(a1);
//		if(l-l1==-1) {
//	System.out.println("Array list is slow");
//	}else {
//		System.out.println("Array list is Fast");
//	}
	}
}
