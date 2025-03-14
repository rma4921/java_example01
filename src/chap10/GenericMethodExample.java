package chap10;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<String> result = Util.boxing("testing");
        System.out.println(result.get());

        Box<Integer> result2 = Util.boxing(1234);
        System.out.println(result2.get());

        Box<Object> result3 = Util.boxing(10222.21);
        System.out.println(result3.get());

        Box<int[]> boxArray = Util.boxing(new int[3]);
    }
}
