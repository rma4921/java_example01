package chap05;

public class NullPointerExceptionExample {
    public static void main(String[] args){
        // int[] array = null; -> new 라는 키워드로 초기화해야 함.
        // array[3] = 0;
        //String str = null;
        String str = "";
        System.out.println(str.equals(10));
    }
}
