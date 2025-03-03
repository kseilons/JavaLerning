package accounts;

public enum AccountType {
	CREDIT("CU", 1.0),
	SAVINGS("SA", 2.0),
	DEPOSIT("DP", 1.0);
	
	private String code;
	private double rate;
	private AccountType(String code, double rate) {
		this.code = code;
		this.rate = rate;
	}
	
	public String getCode() {
		return code;
	}
	
	public double getRate() {
		return rate;
	}
}
