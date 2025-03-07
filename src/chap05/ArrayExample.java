package chap05;

public class ArrayExample {
    public static void main(String[] args){
        String[] array = new String[7];
        array[0] = "월요일";
        array[1] = "화요일";
        array[2] = "수요일";
        array[3] = "목요일";
        array[4] = "금요일";
        array[5] = "토요일";
        array[6] = "일요일";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.print("===============\n");
        for (String test : array){
            System.out.println(test);
        }
        //System.out.println(array[7]);
    }
}
