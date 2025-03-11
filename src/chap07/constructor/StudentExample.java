package chap07.constructor;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("tester", "12345-675852", 20);

        System.out.println("학생 이름: " + student.getName());
        System.out.println("학생 ssn: " + student.getSsn());
        System.out.println("학생 번호: " + student.getStudentNumber());
    }
}
