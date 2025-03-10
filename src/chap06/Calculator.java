package chap06;

public class Calculator {
    int result;

//    int postfixOperator(int a) {
//        a++;
//        return a;
//    }
    void postifxOperator() {
        this.result++;
    }
    public static void main(String[] args) {
        Calculator sample = new Calculator();
//        int a = 1;
//        int result = sample.postfixOperator(a);
//        System.out.println(result);
        sample.result = 1;
        sample.postifxOperator();
        System.out.println(sample.result);

    }
}
