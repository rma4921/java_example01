package chap07.abstrac;

public class Bird extends Animal {
    public String kind = "";
    public Bird() {
        this.kind = "조류";
    }
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
    @Override
    public void sound() {
        System.out.println("짹짹");
    }
}
