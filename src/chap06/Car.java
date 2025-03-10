package chap06;

public class Car /*extends Object*/{ // 자바의 모든 클래스는 최상위 클래스인 Object 클래스를 상속한다.
    // 초기화하지 않으면 기본자료형은 0이고, 참조자료형은 null 값을 가진다.
    // 단, 기본 자료형에 따라 0, 0L, 0.0f, null 문자 등의 값을 가진다.
    private String name;
    private int a;
    public static void main(String[] args) {
        // Car 클래스의 객체 생성
        Car car = new Car();
        // 변수가 private으로 원래라면 직접적으로 바꿀 수 없지만 현재는 Car 클래스 내부이기에 직접 변경이 가능하다.
        System.out.println(car.name);
        System.out.println(car.a);
        car.name = "car";
        System.out.println(car.name);
        Car ferrari = new Car();
        ferrari.name = "ferrari";
        System.out.println(ferrari.name);
        Car sonata = new Car();
        sonata.name = "sonata";
        System.out.println(sonata.name);
        Car avante = new Car();
        avante.name = "avante";
        System.out.println(avante.name);
    }
}
