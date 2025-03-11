package chap07.abstrac;

public class Sample{
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();

        bird.sound();
        cat.sound();
        bird.breathe();
        System.out.println(bird.kind);

        Animal bird2 = new Bird();
        Animal cat2 = new Cat();

        bird2.sound();
        cat2.sound();
        System.out.println(bird2.kind);
        //bird2.breathe(); 불가 업캐스팅하여 자식의 고유 속성에 접근할 수 없다.
    }
}
