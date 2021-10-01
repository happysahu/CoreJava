package oops;

public class Account   {
	
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
	public void withdrawal(double w) throws InsufficientBalance {
		this.balance =  balance-w;
		
		if (balance <500) {
			InsufficientBalance e=new InsufficientBalance();
			//System.out.println(e.getMessage());
			throw e;
			
		}
		
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
	
	
	
}
