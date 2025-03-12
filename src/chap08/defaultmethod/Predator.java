package chap08.defaultmethod;

interface Predator {
    // 변수 선언 불가
    static final double NUM = 3; // 단, 상수는 가능

    String getFood();

    default void printFood() {
        System.out.println("feed " + getFood());
    }

}
