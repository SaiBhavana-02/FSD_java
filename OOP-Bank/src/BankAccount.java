
public class BankAccount {
	float balance;
	long acntno;
	String acntHolderName;
	//constructor- to initialize object variables
	public BankAccount(long acntno,float balance,String acntHoldername) {
		//the keyword "this" belongs to current object it helps to save the num of variables
		this.acntno=acntno;
		this.balance=balance;
		this.acntHolderName=acntHoldername;
	}
	public void deposit(float amount) {
		balance=balance+amount;
	}
	public void withdrawl(float amount) {
		balance=balance-amount;
	}
	public void showBalance() {
		System.out.println("Current Balance: "+balance);
	}
}

