package chap07.constructor;

/*
 * 1. 매개변수가 없는 생성자 호출
 * 2. 부모 클래스에 매개변수가 있는 생성자 생성
 * 3. 오류 안나도록 수정
 * */

public class Sportscar extends Car{

    Sportscar() {
        super("unknown");
    }
    Sportscar(String name) {
        super(name); // super는 반드시 맨 앞에 나와야한다.
    }

    public static void main(String[] args) {
        Sportscar sportscar = new Sportscar();
        Sportscar tester= new Sportscar("0B-45");
    }
}
