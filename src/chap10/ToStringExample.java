package chap10;

import chap09.Acount;

import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        // 어떤 값이 나올까?
        int[] num = {4, 5, 6, 7, 8, 0};
        System.out.println(Arrays.toString(num)); // [4, 5, 6, 7, 8, 0]

        // 어떤 값이 나올까?
        Acount[] accunts = {new Acount(40000), new Acount(3000)};
        System.out.println(Arrays.toString(accunts)); // [chap09.Acount@~~, chap09.Acount@~~]

        // Acount에 balance가 나오도록 수정
        // -> Acount에서 toString을 재정의
    }
}
