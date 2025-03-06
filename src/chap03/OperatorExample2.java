package chap03;

public class OperatorExample2 {
    public static void main(String[] args){
        System.out.println(0.01 == 0.01f);
        System.out.println(0.01 == 0.01);
        // 문자열 동등비교
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
