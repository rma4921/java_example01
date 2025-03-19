package chap12.methodreferance;

public class Calculator {
    public static int staticMethod(int left, int right) {
        return left + right;
    }

    public int instanceMethod(int left, int right) {
        return left * right;
    }
}
