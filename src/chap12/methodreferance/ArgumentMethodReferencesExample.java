package chap12.methodreferance;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        // 람다식 표현
        function = (x, y) -> x.compareToIgnoreCase(y);
        System.out.println("람다식 표현 : " + function.applyAsInt("Spring", "SPRING"));

        // 매개변수의 메서드 참조
        function = String::compareToIgnoreCase;
        System.out.println("매개변수의 메서드 참조: " + function.applyAsInt("Spring", "SPRING"));
    }
}
