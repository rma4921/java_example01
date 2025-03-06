package chap03;

public class OperatorExample {
    public static void main(String[] args){
        int x = 800;
        int result1 = +x;
        int result2 = -x;
        System.out.println(result1);
        System.out.println(result2);

        // 증감연산자
        int num = 10;
        System.out.println(num++);
        System.out.println(++num);
        int value = num++;
        System.out.println(value);
        System.out.println(num);
    }
}
