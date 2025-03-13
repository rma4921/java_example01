package chap09;

public class ArrayExceptionSample {
    public static void main(String[] args) {
        try {
            int index = Integer.parseInt(args[0]);
            int[] num = {1, 2, 3, 4, 5};
            System.out.println(num[index]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("에러발생!!!");
        }
    }
}
