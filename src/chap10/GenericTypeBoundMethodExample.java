package chap10;

public class GenericTypeBoundMethodExample {
    public static void main(String[] args) {
        int result = Util.compare(4, 5);
        System.out.println(result);

        int tester = Util.compare(5.5, 1.1);
        System.out.println(tester);
    }
}
