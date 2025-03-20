package chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortingExample {
    public static void main(String[] args) {
        String[] array = {"k", "a", "w", "g", "c"};

        Arrays.stream(array)
                .sorted()
                .forEach(System.out::print);
        System.out.println("=============");

        List<Integer> list = Arrays.asList(102, 5, 256, 10, 1);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
