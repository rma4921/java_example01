package chap07;

public class Dog extends Animal{
    Dog() {
        //super(); // 생략
        System.out.println("Dog constructor");
    }
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor");
    }

    void sleep(int hour) {
        System.out.println(name + "Zzz... for " + hour + "hours");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); // 자식 클래스의 생성자 호출 -> 부모클래스의 생성자도 자동으로 호출
        dog.name = "happy";
        dog.sleep();
        dog.sleep(5);

        Animal animal = new Animal();
        animal.name = "puppy";
        // animal.sleep(10); // 자식 클래스 요소는 사용 불가

        Dog dog2 = new Dog("cat");
    }
}
