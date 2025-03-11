package chap07;

public class Animal {
    String name;

    Animal() {
        System.out.println("Animal constructor");
    }
    Animal(String name) { // 기본 생성자가 없으면 Dog에서 오류난다. -> Dog에서 부모 생성자를 호출해야 함.
        this.name = name;
    }

    void sleep() {
        System.out.println(name + "Zzz...");
    }
}
