package chap09;

import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream("filename")) {
            reader.read();
            System.out.println("예외 발생기");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("IOException 발생!");
        }
    }
}
