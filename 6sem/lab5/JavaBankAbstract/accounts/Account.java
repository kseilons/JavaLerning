package accounts;

public class Account extends AbstractBankAccount {

    private int bonusValue;
    private AccountType type;

    public Account(String name, int num, int amt, AccountType type) {
        super(name, num, amt + calculateInitialBonusValue(amt), type);
        this.type = type;
    }

    @Override
    public void deposit(int amt) {
        if (amt > 100) balance += (amt + (int) (bonusValue * 0.1));
        else balance += amt;
    }

    private static int calculateInitialBonusValue(int amt) {
        if (amt >= 1 && amt <= 100) return 10;
        else if (amt <= 300) return 20;
        else return 30;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
    	return "\nAccount Type: " + this.type + super.toString(); 
    }
}
