package collectionframwork;

import java.util.Comparator;

public class Salary implements Comparator<Employee> {
	@Override
	
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return  (o2.getSalary()-o1.getSalary());
	}
	

}
