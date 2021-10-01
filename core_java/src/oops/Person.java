package oops;


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

}
