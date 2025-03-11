package chap07.abstrac;

public abstract class Phone {
    private String owner;

    public abstract void turnOff(); // 자식에서 반드시 재정의

    public void turnOn() {
        System.out.println("turn on the phone");
    }
}
