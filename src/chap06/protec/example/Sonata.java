package chap06.protec.example;

import chap06.protec.Car;

public class Sonata extends Car {    // Car를 상속
    public static void main(String[] args) {
        Sonata sonata = new Sonata();
        System.out.println(sonata.company);   // 상속한 클래스의 protected. 변수는 접근 가능
    }
}
