package accounts;
public class CreditAccount extends AbstractBankAccount{

	private int creditLimit;
	
	//overloaded constructor for CreditAccount
	public CreditAccount(String name, int num,int amt)
    {
            super(name,num,amt);
            this.creditLimit = calculateCreditLimit(amt);
            
    }
	public CreditAccount(String name, int num, int amt, int credit)
    {
            super(name,num,amt);
            this.creditLimit = credit;
            
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
		 return super.toString() + "\nCredit Limit   : " + creditLimit;
	 }
	 private static int calculateCreditLimit(int amt) {
		 if (amt > 1 && amt <= 2000)return 100;
		 else if (amt <= 4000) return 200;
		 else return 300;
	 }
}
