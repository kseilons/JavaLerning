package support;

import accounts.AccountType;

public class EnumIteration {
	public static void main(String[] args) {
		for (AccountType type: AccountType.values()) {
			System.out.println("Value: " + type.name() + ", position" + type.ordinal());
		}
	}
}
