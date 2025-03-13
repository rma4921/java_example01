package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        // 파일이 없는 예외 상황 처리
        try {
            reader = new BufferedReader(new FileReader("hi5.txt")); // FileNotFoundException
            System.out.println(reader.readLine()); // IOException
            throw new IOException("IOException");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
            System.out.println(e.getMessage());
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
