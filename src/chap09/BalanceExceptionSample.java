package chap09;

public class BalanceExceptionSample {
    public static void main(String[] args) {
        try {
            throw new BalanceInsufficientException("잔금부족, 잔액: " + 1000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
