package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str = null;

        Optional<String> empty = Optional.empty();
        Optional<String> optional1 = Optional.ofNullable(str);
        // Optional<String> optional2 = Optional.of(str); // error

        List<String> list = null;
        // list.stream().forEach(System.out::println); // error
        Optional.ofNullable(list)
                .orElse(new ArrayList<>())
                .forEach(System.out::println);
    }
}
