package chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {
    public static void main(String[] args) {
        // 1번
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numberList = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println("numberList: " + numberList);

        // 2번
        List<String> sentences = Arrays.asList("Hello:world", "Java:stream:flatMap",
                "Functional:programming");

        List<String> stringList = sentences.stream()
                .flatMap(x -> Arrays.stream(x.split(":")))
                .collect(Collectors.toList());
        System.out.println("stringList: " + stringList);

        // 3번
        List<List<Integer>> numbers2 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> oneList = numbers2.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("oneList: " + oneList);

        // 4번
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );

        List<String> names = people.stream()
                .map(person -> person.name)
                .collect(Collectors.toList());
        System.out.println("names: " + names);

        // 5번
        List<String> filterNames = people.stream()
                .filter(person -> person.age >= 28)
                .map(person -> person.name)
                .collect(Collectors.toList());

        System.out.println("filterNames: " + filterNames);

        // 6번
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> shortWords = words.stream()
                .filter(word -> word.length() <= 5)
                .collect(Collectors.toList());
        System.out.println("shortWords: " + shortWords);

        // 7번
        List<String> words2 = Arrays.asList("hello", "world", "java");

        List<String> upperWords = words2.stream()
                //.sorted((word1, word2) -> word2.compareTo(word1))
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upperWords: " + upperWords);

        // 8번
        List<String> words3 = Arrays.asList("apple", "banana", "cat", "dog", "elephant");

        List<String> longWords = words3.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("longWords: " + longWords);

        // 9번
        List<Integer> numbers3 = Arrays.asList(5, 12, 25, 37, 48, 50, 63);

        List<Integer> tenToFifty = numbers3.stream()
                .filter(word -> word >= 10 && word < 50)
                .collect(Collectors.toList());
        System.out.println("tenToFifty: " + tenToFifty);

        // 10번
        List<String> sentences2 = Arrays.asList("I like apples", "Bananas are tasty",
                "apple pie is delicious", "I have an apple");

        List<String> inApple = sentences2.stream()
                .filter(sentence -> sentence.toLowerCase().contains("apple"))
                .collect(Collectors.toList());
        System.out.println("inApple: " + inApple);
    }
}
