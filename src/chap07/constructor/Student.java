package chap07.constructor;

public class Student extends Person {
    private int studentNumber;

    public Student(String name, String ssn, int studentNumber) {
        super(name, ssn);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }
}
