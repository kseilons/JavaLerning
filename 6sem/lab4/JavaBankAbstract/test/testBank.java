package test;
import accounts.Account;
import accounts.AccountType;

public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account A1 = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
    	// Using default constructor
	Account A2 = new Account("He Xai", 22338, 530, AccountType.SAVINGS);
	Account A3 = new Account("Ilya Mustafana", 44559, 1030, AccountType.SAVINGS);
	
	//Set values of Instances created using default constructor
	A2.setaccountname("He Xai");
	A2.setaccountnum(22338);
	A2.setbalance(500);
	
	A3.setaccountname("Ilya Mustafana");
	A3.setaccountnum(44559);
	A3.setbalance(1000);
	
	// Print accounts
	A1.print();
	A2.print();
	A3.print();
	
	System.out.println(A1);
	System.out.println(A2);
	System.out.println(A3);

}
}
