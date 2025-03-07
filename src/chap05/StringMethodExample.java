package chap05;

public class StringMethodExample {
    public static void main(String[] args){
        String a = "Hello World!";
        System.out.println(a.indexOf("o"));

        boolean isContains = a.contains("World!");
        System.out.println(isContains);

        char ch = a.charAt(8);
        System.out.println("ch: " + ch);

        String replaceValue = a.replaceAll("World!", "Java");
        System.out.println(replaceValue);

        String str = "Hello 1234 Java";
        String replaceValue2 = a.replaceAll("\\d", "");
        System.out.println(replaceValue2);

        System.out.println(a.substring(7, 8));

        System.out.println("대문자: " + a.toUpperCase() + "소문자: " + a.toLowerCase());

        String list = "a:b:c:d";
        String[] result = list.split(":");

        String conCat = "Hello";
        System.out.println(conCat.concat("이어붙이려는 문자열"));
        System.out.println(conCat + "이어붙이려는 문자열");
    }
}
