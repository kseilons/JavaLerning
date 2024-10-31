public class AccountTest {


    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.balance = 256;
        account.name = "Kseilons";

        System.out.println(account.balance);
        System.out.println(account.name);
        account.withDraw(account.balance, 1500);
        account.addMoney(10);
        Bond bond = new Bond(100, 25);

        bond.earnInterest();
    }
}
