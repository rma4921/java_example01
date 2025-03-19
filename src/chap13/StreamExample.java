package chap13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 컬렉션 객체를 사용한 스트림
        List<String> list = Arrays.asList("1", "2", "3", "4");
//        for (String str : list) {
//            System.out.println(str);
//        }
        Stream<String> stram = list.stream();
        stram.forEach(System.out::println);
        System.out.println("================");

        // 배열 객체를 사용한 스트림
        String[] arr = {"a1", "b2", "c3", "d4"};

        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);
        System.out.println("================");

        // 숫자 범위를 사용한 스트림
        IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
        intStream.forEach(System.out::println);
        System.out.println("================");
        DoubleStream doubleStream = new Random().doubles(5);
        doubleStream.forEach(System.out::println);
        System.out.println("================");

        // 파일을 사용한 스트림
        try {
            Stream<String> stream3 = Files.lines(Path.of("hi.txt"), Charset.forName("UTF-8"));
            stream3.forEach(System.out::println);
            System.out.println("================");
        } catch (IOException e) {
            System.out.println("파일 입출력 오류!" + e.getMessage());
            System.out.println("================");
        }

        // 스트림 연결
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> integerStream2 = Stream.of(11, 12, 13, 14, 15, 16);
        Stream<Integer> newStream = Stream.concat(integerStream1, integerStream2);
        newStream.forEach(System.out::println);
    }
}
