package collectionframwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEployeeName("Harsh");
	e.setSalary(20000);
	
	Employee e1=new Employee();
	e1.setEployeeName("Rajat");
	e1.setSalary(30000);
	
	Employee e2=new Employee();
	e2.setEployeeName("Sonu");
	e2.setSalary(35000);
	
	Employee e3=new Employee();
	e3.setEployeeName("Shubham");
	e3.setSalary(25000);
	
	Employee e4=new Employee();
	e4.setEployeeName("Rahul");
	e4.setSalary(23000);
	
	Employee e5=new Employee();
	e5.setEployeeName("Gaurav");
	e5.setSalary(32000);
	
	Employee e6=new Employee();
	e6.setEployeeName("Raghav");
	e6.setSalary(12000);
	
	Employee e7=new Employee();
	e7.setEployeeName("Shekhar");
	e7.setSalary(4500);
	
	ArrayList a=new ArrayList();
	a.add(e);
	a.add(e1);
	a.add(e2);
	a.add(e3);
	a.add(e4);
	a.add(e5);
	a.add(e6);
	a.add(e7);
	
	Collections.sort(a,new Salary());
	Iterator i=a.iterator();
	
	while(i.hasNext()){
		Employee s=(Employee)i.next();
		System.out.println(s.getEployeeName()+" "+s.getSalary());
		
	}
}
}
