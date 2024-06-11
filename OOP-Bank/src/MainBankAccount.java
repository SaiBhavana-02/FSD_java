
public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savingsAccount=new BankAccount(1254965874L,15236.24f,"Bhavana");
		//invoke the methods
		savingsAccount.showBalance();
		savingsAccount.deposit(10000.00f);
		savingsAccount.showBalance();
		savingsAccount.withdrawl(5000.00f);
		savingsAccount.showBalance();
		//recurring account
		BankAccount rdAccount= new BankAccount(465847874L,500000.00f,"Saritha");
		rdAccount.showBalance();
		rdAccount.deposit(10000.00f);
		rdAccount.showBalance();
		rdAccount.withdrawl(5000.00f);
		rdAccount.showBalance();
	}

}
//encapsulation-combining data and methods
//inheritance-reusability  of existing resources or extension ability