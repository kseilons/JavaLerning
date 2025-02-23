package accounts;

public class Account extends AbstractBankAccount{


	private int bonusValue;
	
	public Account(String name, int num, int amt){
		super(name, num, amt + calculateInitialBonusValue(amt));
		
	}
	
	
	
	
	@Override
	public void deposit(int amt){

		if (amt > 100) balance += (amt + (int)(bonusValue * 0.1));
		else balance += amt;
	    
	}
	
	   	   
	private static int calculateInitialBonusValue(int amt) {
		if (amt >= 1 && amt <= 100) return 10;
		else if (amt <= 300) return 20;
		else return 30;
	}
}
