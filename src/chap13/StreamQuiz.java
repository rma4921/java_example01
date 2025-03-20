package chap13;

import java.util.stream.IntStream;

public class StreamQuiz {
    public static void main(String[] args) {
        System.out.println("5부터 10까지");
        int sum = IntStream.rangeClosed(5, 10)
                .peek(x -> System.out.print(x + " "))
                .sum();
        System.out.println("\n5부터 10까지 합: " + sum);
    }
}
