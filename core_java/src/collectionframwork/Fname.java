package collectionframwork;

import java.util.Comparator;

public class Fname implements Comparator<Marksheet> {
  
	@Override
	
	public int compare(Marksheet m1, Marksheet m2) {
		if(m1.getfName()!=m2.getfName()) {
	return m1.getfName().compareTo(m2.getfName()); 
		}else {
			return m1.getlName().compareTo(m2.getlName());
	}
	}

}
