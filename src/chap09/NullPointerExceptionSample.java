package chap09;

// NPE -> 개발자 실수, 코드 작성 단계에서 수정 필요

public class NullPointerExceptionSample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException이 발생했습니다.");
            System.out.println("예외 메시지: " + e.getMessage());
        }
    }
}
