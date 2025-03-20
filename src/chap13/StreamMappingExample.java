package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print); // 확인을 하기 위한 코드
        System.out.println("\n ======================");

        List<String> newList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // 실무에서 많이 사용. 결과 단계.
                // .toList();로 사용 가능
        System.out.println(newList);
        System.out.println("\n ======================");

        List<String> list2 = Arrays.asList("Hello World", "Java stream");
        List<String> newList2 = list2.stream()
                .flatMap(input -> Arrays.stream(input.split(" ")))
                        .toList();
        System.out.println(newList2);
    }
}
