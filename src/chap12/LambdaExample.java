package chap12;

public class LambdaExample {
    public static void main(String[] args) {
        // 익명 구현 객체
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run.run() 출력문");
            }
        };
        // 람다식 표현 유일한 추상 메서드가 있을 때만 사용가능
        Runnable runnable = () -> System.out.println("runnable.run() 출력문");
        runnable.run();
    }
}
