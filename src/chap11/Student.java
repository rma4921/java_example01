package chap11;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student)obj;
            return (no == student.no) && (name.equals(student.name));
        }
        return false;
    }
    @Override
    public int hashCode() {
        return no + name.hashCode();
    }
}