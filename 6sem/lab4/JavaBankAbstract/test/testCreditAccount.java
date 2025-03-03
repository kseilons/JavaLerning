package test;
import accounts.AbstractBankAccount;
import accounts.Account;
import accounts.AccountType;
import accounts.CreditAccount;

public class testCreditAccount {
	

	public static void main(String[] args) {
	     
		// Instantiate 3 accounts
	    // Using constructor with values
	    Account A1 = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
	    	// Using default constructor
	    Account A2 = new Account("He Xai", 22338, 530, AccountType.SAVINGS);
		Account A3 = new Account("Ilya Mustafana", 44559, 1030, AccountType.SAVINGS);
		// Instantiate 2 credit accounts
		// Using default constructor
		CreditAccount C1 = new CreditAccount("A N Other", 88776, 500);
		// Using constructor with values which will call constructor from super
		CreditAccount C2 = new CreditAccount("Another",66778,1000,500);
		
		//Set values of Instances created using default constructor
		A2.setaccountname("He Xai");
		A2.setaccountnum(22338);
		A2.setbalance(500);
		
		A3.setaccountname("Ilya Mustafana");
		A3.setaccountnum(44559);
		A3.setbalance(1000);
		
		C1.setaccountname("A.N Other");
		C1.setaccountnum(88776);
		C1.setbalance(500);

		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(C1);
		System.out.println(C2);
		
		
//		AbstractBankAccount C3 =  (AbstractBankAccount) new CreditAccount("Another",66778,1000);
//		
//		C3.getCreditLimit();
		
		
    }
}

