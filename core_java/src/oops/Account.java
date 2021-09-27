package oops;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void deposit(double d) {
		this.balance=d+balance;
	}
	public void withdrawal(double w) {
		this.balance =  balance-w;
		}
	public double getBalance() {
		return balance;
	}
	public void paybill (double p) {
		this.balance=balance-p;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account a=new Account();
		a.setNumber("67437378257");
		a.setAccountType("Saving");
		a.setBalance(100);
		a.withdrawal(50);
		a.deposit(10);
		a.paybill(20);
		System.out.println("Remaning balance is "+a.getBalance());
	
}
}
