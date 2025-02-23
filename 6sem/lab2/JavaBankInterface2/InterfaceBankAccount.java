
public interface InterfaceBankAccount {
	
	public final String BANK = "JavaBank";
	
	void deposit(int amt);
	void withDraw(int amt);
	int getBalance();
	String getBankName();
}