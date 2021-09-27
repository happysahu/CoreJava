package oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
private String name;
private String address;
private Date Dob;
public static final int AVG_AGE=60;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Date getDob() {
	return Dob;
}
public void setDob(Date dob) {
	Dob = dob;
}
public static void main(String[] args) throws ParseException {
	Person p = new Person();
	Date d=new Date();
	System.out.println(d);
	SimpleDateFormat h=new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	p.setDob(h.parse("12/10/2001"));
	p.setName("Harsh");
	p.setAddress("Madhu milan");
	//p.setDob("12/10/2001");
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(p.getDob());
	System.out.println("Average is "+Person.AVG_AGE);
}
}
