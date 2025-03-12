package accounts;

public class Account extends AbstractBankAccount{


	private int bonusValue;
	
	public Account(String name, int num, int amt, AccountType type){
		super(name, num, amt + calculateInitialBonusValue(amt), type);
	}
	
	
	
	
	@Override
	public void deposit(int amt){

		if (amt > 100) balance += (amt + (int)(bonusValue * 0.1));
		else balance += amt;
	    
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	private static int calculateInitialBonusValue(int amt) {
		if (amt >= 1 && amt <= 100) return 10;
		else if (amt <= 300) return 20;
		else return 30;
	}
}
