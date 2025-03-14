package chap10;

public class GenericTypeExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set(1000);

        int value = (int) box.get();
        System.out.println("Generic Type 사용하지 않운 경우.");
        System.out.println("value: " + value);

        Box<String> box2 = new Box<>();
        box2.set("문자열");
        String str = box2.get();
        System.out.println("Generic Type 사용한 경우.");
        System.out.println("str: " + str);
    }
}
