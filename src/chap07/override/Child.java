package chap07.override;

public class Child extends Parent{
    String field2;
    // Override는 부모 메소드와 동일한 시그니처(리턴타입, 메소드이름, 매개변수)를 가져야 한다.
    // 단, 접근제한자는 부모보다 강력해질 수 없다. ex) public -> protected (x), default -> public (o)
    @Override
    void method2() {
        System.out.println("Child.method2()");
    }
    void method3() {
        System.out.println("Child.method3()");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();
    }
}
