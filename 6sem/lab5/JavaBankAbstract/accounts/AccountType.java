package accounts;

public enum AccountType {
	SAVINGS("SA", 1.0),
    CREDIT("CR", 3.0);

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