package chap12;

public class LambdaPractice {
    public static void main(String[] args) {
        Square square = (value) -> value * value;

        int num = 20;
        System.out.println("x = " + num);
        System.out.println("x * x = " + square.square(num));
    }
}
