package oops;

public class PersonForConstructor  {
	protected String Firstname;
	protected String Lastname;
	protected String Address;
	public PersonForConstructor() {
		System.out.println("Default");
	}
	public PersonForConstructor(String fname,String lname) {
		Firstname=fname;
		Lastname=lname;
		System.out.println("2 PARAMETER");
	}
	public PersonForConstructor(String fname,String lname,String Address) {
		this(fname,lname);
		this.Address=Address;
		System.out.println("3 Parameter");
	}
	

}
