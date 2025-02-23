package test;
import accounts.AbstractBankAccount;
import accounts.Account;
import accounts.CreditAccount;

public class TestCustomerAccounts {

	public static void main(String[] args) {
		AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];
		
		bankAccount[0] = new Account("Sanjay Gupta", 11556, 300);
		bankAccount[1] = new Account("He Xai", 22338, 500);
		bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000);
		

		bankAccount[3] = new CreditAccount("A.N. Other", 88776, 500);
		bankAccount[4] = new CreditAccount("Another", 66778, 1000, 500);
		
		showAllCustomerAccounts(bankAccount);
		showAllAccounts(bankAccount);
		showAllCreditAccounts(bankAccount);
		
	}
	
	public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount) {
		
		System.out.println("\nAll Customer Accounts");
		for (AbstractBankAccount account: bankAccount) {
			System.out.println(account);
		}
	}
	
	public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Account Types");

		for (AbstractBankAccount account: bankAccount) {
			if (account instanceof Account) System.out.println(account);
		}
	}
	
	
	public static void showAllCreditAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Credit Account Types");

		for (AbstractBankAccount account: bankAccount) {
			if (account instanceof CreditAccount) System.out.println(account);
		}
	}
	
	
	
	
	
	private void show() {
		System.out.print("a");
	}
}

