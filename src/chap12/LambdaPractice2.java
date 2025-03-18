package chap12;

public class LambdaPractice2 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        int num = 20;
        int ber = 10;
        System.out.println("x = " + num + " y = " + ber);
        System.out.println("x + y = " + add.calculate(num, ber));
        System.out.println("x * y = " + multiply.calculate(num, ber));
        System.out.println("x / y = " + divide.calculate(num, ber));
    }
}
