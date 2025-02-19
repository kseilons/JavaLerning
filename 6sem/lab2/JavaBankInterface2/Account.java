
public class Account implements InterfaceBankAccount{
		String accountname;
	    int accountnum;
	    int balance;
	    //default constructor for Account
	    Account(){
	    	this.accountname="EMPTY";
	    	this.accountnum=0;
	    	this.balance=0;
	    }
	    
	    Account(String name, int num,int amt){
	            accountname=name;
	    	    accountnum=num;
	            balance=amt;
	    }
	    //make a deposit to the balance
	    
	    @Override
	    public void deposit(int amt)
	    {
	    	    balance=balance+amt;
	    }
	    
	    @Override
	    public void withDraw(int amt)
	    {
	    	    balance=balance-amt;
	    }
	    
	    @Override
	    public int getBalance() {
	    	return balance;
	    }
	    
	    @Override
	    public String getBankName() {
	    	return InterfaceBankAccount.BANK;
	    }
	    
	    public void print() {
	    	System.out.println("\nBank Name      :" + getBankName() + 
	    					  "\nAccount Holder :" + accountname + 
	    					  "\nAccount Number :" + accountnum + 
	    					  "\nAccount balance:" + balance);
	    }
	    
	    public void setaccountname(String name)
	    {
	    	    accountname = name;
	    }

	    
	    public void setaccountnum(int num)
	    { accountnum = num;}

	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }

	    public String getaccountname ( ) {
	    	return accountname;
	    }

	    public int getaccountnum ( ) {
	    	return accountnum;
	    }
	    
	   
	}
