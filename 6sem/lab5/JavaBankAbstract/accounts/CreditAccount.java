package accounts;
public class CreditAccount extends AbstractBankAccount{

	private int creditLimit;
	private AccountType type;
	
	//overloaded constructor for CreditAccount
	public CreditAccount(String name, int num,int amt, AccountType type)
    {
            super(name,num,amt,type);
            this.creditLimit = calculateCreditLimit(amt);
            this.type = type;
            
    }
	public CreditAccount(String name, int num, int amt, int credit,AccountType type)
    {
            super(name,num,amt,type);
            this.creditLimit = credit;
            this.type = type;
    }
	//modifier to set the account creditlimit
	 public void setcreditlimit(int num)
	    {
	    	    creditLimit = num;
	    }
	//accessor to get the account creditlimit
	 public int getcreditlimit ( ) {
	   	 
	    	return creditLimit;
	    
	 }
	 
	 public AccountType getType() {
		 return type;
	 }

	 public void setType(AccountType type) {
		 this.type = type;
	 }
	 
	 @Override
	 public void deposit(int amt) {
		 balance += amt;
	 }
	 //print method 
	 public void print() {
	    	System.out.println("\nBank Name      :" + getBankName() + 
	    					  "\nAccount Holder :" + accountname + 
	    					  "\nAccount Number :" + accountnum + 
	    					  "\nAccount balance:" + balance);
	    }
	 
	 
	 @Override
	 public String toString() {
		 return super.toString() + "\nCredit Limit   : " + creditLimit +
				 "\nAccount Type: " + this.type;
	 }
	 private static int calculateCreditLimit(int amt) {
		 if (amt > 1 && amt <= 2000)return 100;
		 else if (amt <= 4000) return 200;
		 else return 300;
	 }
}
