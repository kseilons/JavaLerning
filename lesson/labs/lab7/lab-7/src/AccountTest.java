public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.balance = 256;
        account.name = "Kseilons";

        System.out.println(account.balance);
        System.out.println(account.name);


    }
}




// account.withDraw(account.balance, 1500);

//Bond bond = new Bond();
//bond.balance = 100;
//        bond.setTermAndRate(25);
//        bond.earnInterest();