package oops;

public class EmployeeConstructor extends PersonForConstructor{
private String Designation;
public EmployeeConstructor() {
	System.out.println("Default");
}
public EmployeeConstructor(String fname,String lname) {
	super(fname,lname);
	System.out.println("2");
}
public EmployeeConstructor(String fname,String lname,String Address) {
	super(fname,lname,Address);
	
	System.out.println("3");
}
public EmployeeConstructor(String fname,String lname,String Address,String Designation) {
	super(fname,lname,Address);
	this.Designation=Designation;
	System.out.println(4);
}
public static void main(String[] args) {
	EmployeeConstructor e=new EmployeeConstructor("Harsh","Sahu","BCA","Heran gali pareshan mohalla shamshan ke piche");
	System.out.print(e.Firstname);
	System.out.print(" ");
	System.out.print(e.Lastname);
	System.out.print("\n");
	System.out.println(e.Address);
	System.out.print(e.Designation);
	
}
}
