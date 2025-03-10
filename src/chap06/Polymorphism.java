package chap06;

public class Polymorphism {
    public static void main(String[] args){
        // 다형성 예시. 상위 클래스 타입의 참조 변수로 하위 클래스를 참조할 수 있다.
        Number number1 = Integer.valueOf(1);
        Number number2 = Long.valueOf(123);
        Number number3 = Double.valueOf(10);
    }
}
