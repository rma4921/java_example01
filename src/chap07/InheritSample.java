package chap07;

public class InheritSample {
    public static void main(String[] args) {
        InheritB inheritB = new InheritB();
        /* InheritA랑 같은 패키지면 사용할 수 있다.
        inheritB.field1 = 1;
        inheritB.method1();
        */
        inheritB.field2 = 2;
        inheritB.method2();
    }
}
