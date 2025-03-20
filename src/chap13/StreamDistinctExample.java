package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "b", "c", "d", "e", "e", "a");
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("============");

        List<String> list2 = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");
        list2.stream()
                .filter(str -> str.startsWith("김"))
                .distinct()
                .forEach(System.out::println);
        System.out.println("============");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("AAA");
        arrayList.add("BBB");
        arrayList.add("BBB");
        arrayList.add("CCC");
        arrayList.add("DDD");
        arrayList.add(new String("AAA"));

        arrayList.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
