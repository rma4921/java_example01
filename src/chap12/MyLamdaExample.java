package chap12;

public class MyLamdaExample {
    public static void main(String[] args) {
        MyFunctionalInterface inter = () ->
                System.out.println("매개변수가 없고 리턴값이 없는 람다표현식.");

        MyFunctionalInterface2 inter2 = value ->
                System.out.println("입력받은 값: " + value);
        inter2.method(100);

        MyFunctionalInterface3 inter3 = (x, y) -> {
            int multiple = x * y;
            System.out.println(multiple);
            return multiple;
        };
        inter3.method(10, 50);

        MyFunctionalInterface4 inter4 = str -> str.length();
        int result = inter4.run("특정문자열");
        System.out.println("특정 문자열의 길이는 " + result + "입니다.");
    }
}
