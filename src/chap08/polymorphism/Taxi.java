package chap08.polymorphism;

public class Taxi implements Vehicle {

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
