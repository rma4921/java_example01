package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        /* 오류
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        */
        // Optional 객체를 얻어 값이 실제로 존재할 때만 평균을 출력
        OptionalDouble avg1 = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (avg1.isPresent()) {
            System.out.println(avg1.getAsDouble());
        }

        // 값이 없을 경우 디폴트 값으로
        double avg2 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg2);

        // 값이 있을을 때만
        avg1.ifPresent(System.out::println);
        // avg1.ifPresentOrElse(System.out::println, () -> System.out.println("값이 비었습니다"));
    }
}
