package oops;

public class Account1 {
	
	private String name;
	private String Accnumber;
	private String accountType;
	private double balance;
	
	public Account1(String n,String Num,String Acc,double bal) {
		name=n;
		Accnumber=Num;
		accountType=Acc;

		balance=bal;
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
	
	public static void FundTransfer(Account1 source,Account1 receiver,double amount) throws InsufficientBalance {
		source.withdrawal(amount);
		receiver.deposit(amount);
		
		
	}
	
	public void display() {
		System.out.println(" Name : "+this.name);
		System.out.println("Account Num: "+this.Accnumber);
		System.out.println("Account Type : "+this.accountType);
		System.out.println("Balance : "+this.balance);
	}
	public static void main(String[] args) throws InsufficientBalance {
		Account1 Hrash=new Account1("Harsh sahu","123","Saving Account",5000);
		Hrash.display();
		Account1 Aman=new Account1("Aman PAndey","12345","Saving Account",2000);
		Aman.display();
		Account1.FundTransfer(Hrash, Aman, 2000);
		Hrash.display();
	    Aman.display();
	
	}
	
}	

