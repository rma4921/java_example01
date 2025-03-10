package chap06;
class EmptyClass {
}
class TestClass {
    // 필드
    private int value = 0;
    // 생성자
    TestClass(int value) {
        this.value = value;
    }
    // 메소드
    public int getValue() {
        return this.value;
    }
}
public class ClassExample {
    public static void main(String[] args){
        // 자바에서는 빈 클래스라고 해도 객체를 생성할 수 있다.
        EmptyClass empty = new EmptyClass();
        TestClass test = new TestClass(20);
        System.out.println(test.getValue());
    }
}
