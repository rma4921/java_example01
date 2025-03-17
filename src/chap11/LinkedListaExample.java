package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListaExample {
    public static void main(String[] args) {
        List<String> arrayList= new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        System.out.println("ArrayList insert: " + (System.nanoTime() - startTime) + "ns");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(String.valueOf(i));
        }
        System.out.println("ArrayList add: " + (System.nanoTime() - startTime) + "ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        System.out.println("LinkedList insert: " + (System.nanoTime() - startTime) + "ns");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(String.valueOf(i));
        }
        System.out.println("LinkedList add: " + (System.nanoTime() - startTime) + "ns");
    }
}
