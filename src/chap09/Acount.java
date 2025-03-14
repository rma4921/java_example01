package chap09;

public class Acount {
    private int balance;

    public Acount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money) {
            throw new BalanceInsufficientException("잔고가 부족: " + (balance - money) + " 부족합니다.");
        }
        balance -= money;
    }
    @Override
    public String toString(){
        return String.valueOf(balance);
    }
}
