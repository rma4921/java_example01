package chap02;

public class StringConvertToNumber {
    public static void main(String[] args){
        String str = "12345";
        //String str = "test"

        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);
        long longValue = Long.parseLong(str);
        float floatValue = Float.parseFloat(str);
        double doubleValue = Double.parseDouble(str);

        System.out.println(intValue);
        System.out.println(integerValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}
