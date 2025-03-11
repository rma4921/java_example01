package chap07.abstrac;

public class SamSongPhone extends Phone {
    int test = 0;
    @Override
    public void turnOff() {
        System.out.println("Samsong phone off");
    }
    public static void main(String[] args) {
        SamSongPhone samSongPhone = new SamSongPhone();
        samSongPhone.test = 10;
        samSongPhone.turnOn();
        samSongPhone.turnOff();

        Phone phone = new SamSongPhone(); // 다형성
        //phone.test = 10; 안됨. 부모 타입으로 자식 객체를 참조하여 부모 클래스의 기능만 사용할 수 있다.
        phone.turnOff(); // 단 오버라이딩된 메서드가 있다면 자식 클래스의 메서드가 실행한다.

    }
}
