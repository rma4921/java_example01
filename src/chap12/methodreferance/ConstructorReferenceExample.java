package chap12.methodreferance;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Function<String, Member> function;
        BiFunction<String, String, Member> biFunction;

        // 람다식 표현
        function = id -> new Member(id); // 생성자(id) : 1234호출
        function.apply("1234");
        biFunction = (id, name) -> new Member(id, name);
        biFunction.apply("1234", "I");

        // 생성자 참조
        function = Member::new;
        function.apply("1234");
        biFunction = Member::new;
        biFunction.apply("1234", "I");

        Member member = biFunction.apply("5881", "tester");
        System.out.println("ID: " + member.getId());
        System.out.println("Name: " + member.getName());
    }
}
