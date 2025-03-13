package chap09;

public class BalanceExceptionSample3 {
    public static void main(String[] args) {
        throw new BalanceInsufficientException2("잔금부족, 잔액: " + 1000);
    }
}
