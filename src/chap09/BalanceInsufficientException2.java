package chap09;

public class BalanceInsufficientException2 extends RuntimeException {
    public BalanceInsufficientException2() {

    }
    public BalanceInsufficientException2(String errorMessage) {
        super(errorMessage);
    }
}
