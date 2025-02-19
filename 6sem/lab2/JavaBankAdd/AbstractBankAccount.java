
public abstract class AbstractBankAccount {

	public final String BANK = "JavaBank";
	protected String accountname;
    protected int accountnum;
    protected int balance;
    
    AbstractBankAccount(){
    	accountname = "Empty";
    	accountnum = 0;
    	balance = 0;
    }
    AbstractBankAccount(String name, int num,int amt){
        accountname=name;
	    accountnum=num;
        balance=amt;
}
    
	public abstract void deposit(int amt);

    public void withDraw(int amt){ 
    	balance=balance-amt;
    }
    
    public int getBalance() {
    	return balance;
    }
    
    public String getBankName() {
    	return BANK;
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
