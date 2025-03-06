package chap04;

public class ForExample {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
        String[] numbers = {"one", "two", "three", "four"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
