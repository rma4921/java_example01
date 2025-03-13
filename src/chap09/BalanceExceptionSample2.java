package chap09;

// 1. try-catch 예외처리
// 2. 예외 던지기(책임 전가)
public class BalanceExceptionSample2 {
    public static void main(String[] args) {
        //throwMethod();
    }
    void throwMethod() throws BalanceInsufficientException { // throws, 던졌기 때문에 호출된 곳에서 예외처리해야 한다.
        throw new BalanceInsufficientException("잔금부족, 잔액: " + 1000);
    }
}
