package collectionframwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
public static void main(String[] args) {
	Marksheet m1=new Marksheet();
	m1.setRollNo("6");
	m1.setfName("Rahul");
	m1.setlName("Sharma");
	m1.setPhy(67);
	m1.setCh(76);
	m1.setMat(85);
	
	Marksheet m2=new Marksheet();
	m2.setRollNo("5");
	m2.setfName("Rahul");
	m2.setlName("Verma");
	m2.setPhy(23);
	m2.setCh(34);
	m2.setMat(65);
	
	Marksheet m3=new Marksheet();
	m3.setRollNo("2");
	m3.setfName("Rahul");
	m3.setlName("Kasera");
	m3.setPhy(67);
	m3.setCh(76);
	m3.setMat(85);
	
	Marksheet m4=new Marksheet();
	m4.setRollNo("1");
	m4.setfName("Harsh");
	m4.setlName("Upadhyay");
	m4.setPhy(12);
	m4.setCh(16);
	m4.setMat(15);
	
	Marksheet m5=new Marksheet();
	m5.setRollNo("7");
	m5.setfName("Harsh");
	m5.setlName("Sahu");
	m5.setPhy(98);
	m5.setCh(72);
	m5.setMat(95);
	
	Marksheet m6=new Marksheet();
	m6.setRollNo("4");
	m6.setfName("Monish");
	m6.setlName("Parmar");
	m6.setPhy(68);
	m6.setCh(79);
	m6.setMat(85);
	
	Marksheet m7=new Marksheet();
	m7.setRollNo("3");
	m7.setfName("Monish");
	m7.setlName("Awasthi");
	m7.setPhy(32);
	m7.setCh(23);
	m7.setMat(43);
	
	ArrayList q=new ArrayList();
	q.add(m1);
	q.add(m2);
	q.add(m3);
	q.add(m4);
	q.add(m5);
	q.add(m6);
	q.add(m7);
	//Fname f=new Fname();
	Collections.sort(q,new Fname());
	Iterator i=q.iterator();
	while(i.hasNext()){
	Marksheet s=(Marksheet)i.next();
	System.out.println(s.getRollNo()+" "+s.getfName()+" "+s.getlName()+" "+s.getPhy()+" "+s.getCh()+" "+s.getMat());
		
	}
}
}
