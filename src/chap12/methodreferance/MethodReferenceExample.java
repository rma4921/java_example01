package chap12.methodreferance;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메서드 참조
        // operator = (x, y) -> Calculator.staticMethod(x, y);
        operator = Calculator::staticMethod;
        System.out.println(operator.applyAsInt(1, 2));

        // 인스턴스 메서드 참조
        Calculator calculator = new Calculator();
        // operator = (x, y) -> calculator.instanceMethod(x, y);
        operator = calculator::instanceMethod;
        System.out.println(operator.applyAsInt(1, 2));
    }
}
