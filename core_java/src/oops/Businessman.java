package oops;

public class Businessman extends Person implements Richman,SocialWorker {


public void HelptoOther() {
System.out.println("Help");
}
public void Earnmoney() {
	System.out.println("Earn");
}	
public void Donation() {
	System.out.println("Donation");
}

public void Party() {
	System.out.println("Party");
	
}
public static void main(String[] args) {
	Businessman bm =new Businessman();
	bm.Party();
	bm.setAddress("Madhu milan");
	bm.setName("Harsh sahu");
	System.out.println(bm.getAddress());
	System.out.println(bm.getName());
}

}
