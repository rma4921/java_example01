package chap07;

// InheritA를 상속

import chap07.newpack.InheritA;

public class InheritB extends InheritA {
    int field2;

    void method2() {
        System.out.println("InheritB.method1, field2: " + field2);
    }
}
