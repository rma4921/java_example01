package chap02;

public class NumberConvertToString {
    public static void main(String[] args){
        int num = 3456;
        Long test = null;
        String convert1 = Integer.toString(num);
        String convert2 = String.valueOf(num);
        String convert3 = num + "";
        String convert4 = String.valueOf(1000000000L);
        String convert5 = String.valueOf('c');
        String convert6 = String.valueOf(test); //null safe

        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);
        System.out.println(convert4);
        System.out.println(convert5);
        System.out.println(convert6);
    }
}
