package oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat h=new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		p.setDob(h.parse("12/10/2001"));
		p.setName("Harsh");
		p.setAddress("Madhu milan");
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		System.out.println("Average is "+Person.AVG_AGE);
	}
}
