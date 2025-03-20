package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamLoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);

        OptionalInt maxValueOpt = list.stream()
                .mapToInt(x -> x)
                .filter(x-> x % 2 ==0)
                .peek(System.out::println)
                .max(); // 없으면 peek 동작 X
        int maxValue = maxValueOpt.orElseGet(() -> -9999);
        System.out.println("최댓값: " + maxValue);
    }
}
