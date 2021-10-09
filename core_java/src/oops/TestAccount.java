package oops;

public class TestAccount {
	public static void main(String[] args) throws InsufficientBalance {
		Account a=new Account();
		a.setNumber("67437378257");
		a.setAccountType("Saving");
		a.setBalance(1000);
		a.deposit(10);
		a.paybill(20);
		a.withdrawal(600);
		System.out.println("Remaning balance is "+a.getBalance());
	}
}
