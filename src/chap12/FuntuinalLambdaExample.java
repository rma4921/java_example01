package chap12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuntuinalLambdaExample {
    public static void main(String[] args) {
        // Supplier<T>
        Supplier<String> supplier = () -> "리턴값만 있음";
        System.out.println("Supplier<T> 실습 결과: " + supplier.get());

        // Consumer<T>
        Consumer<Integer> consumer = number ->
                System.out.println("Consumer<T> 실습 결과: " + number);
        consumer.accept(123);

        // Function<T, R>
        Function<Integer, String> function = num -> String.valueOf(num);
        System.out.println("Function<T, R> 실습 결과(숫자->문자): " + function.apply(243));
        Function<String, Integer> function2 = str -> Integer.parseInt(str) + 50;
        System.out.println("Function<T, R> 실습 결과: " + function2.apply("123"));

        // Predicate<T>
        Predicate<Integer> predicate = x -> x % 2 != 0;
        if (predicate.test(11)) {
            System.out.println("Predicate<T> 실습 결과: 홀수");
        } else {
            System.out.println("Predicate<T> 실습 결과: 짝수");
        }
    }
}
