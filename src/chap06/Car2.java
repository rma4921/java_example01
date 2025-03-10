package chap06;

public class Car2 {
    private String name;
    private String model;
    private int maxSpeed;

    // 클래스는 기본 생성자가 기본적으로 주어지지만, 새로운 생성자를 정의하면 기본 생성자는 없어진다.
    Car2(String name){
        this.name = name;
        this.model = "unknown";
        this.maxSpeed = 100;
    }
    // 단, 기본 생성자를 지정하면 사용할 수 있다. 다른 생성자를 정의해도 사라지지 않는다,
    /*
    Car2(){
        this.name = "car";
    }
    */
    // 생성자 오버로딩
    Car2(String name, String model){
        this.name = name;
        this.model = model;
        this.maxSpeed = 100;
    }
    Car2(String name, String model, int maxSpeed){
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    // 리턴타입이 없는 메소드
    public void engineStart(){
        System.out.println("Engine Start!");
    }
    //리턴타입이 있는 메소드
    public int retrunMaxSpeed(){
        return this.maxSpeed;
    }

    public static void main(String[] args) {
        // Car2 car = new Car2(); // 에러
        Car2 bus = new Car2("bus");
        Car2 taxi = new Car2("taxi", "sportage");
        Car2 truck = new Car2("truck", "Fumigator", 50);
        System.out.println("Car2 name: " + truck.name);
        System.out.println("Car2 model: " + truck.model);
        System.out.println("Car2 maxSpeed: " + truck.maxSpeed);

        taxi.engineStart();
        System.out.println(bus.retrunMaxSpeed());
    }
}
