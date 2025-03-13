package chap09;

public class DivideExceptionSample {
    public static void printByMessage() {
        System.out.println("종료");
    }

    public static void main(String[] args) {
        int inputValue = Integer.parseInt(args[0]);
        int result = 0;
        try {
            result = 5/ inputValue;
        } catch (ArithmeticException e) {
            result = -2;
            System.out.println("오류: " + e.getMessage());
        }
        finally {
            System.out.println("결과" + result);
            printByMessage();
        }
    }
}
