package chap13;

import java.util.LinkedList;
import java.util.Optional;
import java.util.List;

public class OptionalExample2 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        // System.out.println(optional.get()); // error, 안전하지 않음.
        if (optional.isPresent()) { // 있을 경우에만
            System.out.println(optional.get());
        }

        // 객체가 없으면 other: 입력
        String strDefault = optional.orElse("문자열");
        System.out.println("default String: " + strDefault);

        Optional<List<String>> optional2 = Optional.ofNullable(null);
        optional2.orElseGet(LinkedList::new)
                .forEach(System.out::println);
        optional2.orElseThrow(RuntimeException::new);
    }
}
