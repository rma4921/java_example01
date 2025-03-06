package chap02;

import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 박싱
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList: " + arrayList);
        // 언박싱
        Integer integerValue1 = Integer.valueOf(10);
        int integerValue2 = integerValue1;
        System.out.println("integerValue2: " + integerValue2);
    }
}