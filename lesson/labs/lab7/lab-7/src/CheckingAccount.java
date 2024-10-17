public class CheckingAccount {
    int balance;
    String name;

    public void withDraw(int balance, int wantToGet){
        if (balance < wantToGet) System.out.println("Недостаточно средств");
        else if (wantToGet < 0) System.out.println("Нельзя снять отрицательное кол-во средств");
        else System.out.println("Оставшееся кол-во средств: " + (balance - wantToGet));
    }
}
