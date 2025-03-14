package chap10.WildCard;

public class Course<T> {
    private String name;
    private T[] students;
    private int index;

    public Course(String name, int capacity) {
        this.name = name;
        // 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없다.
        // (T[]) (new Object[n])으로 형변환해야 함.
        students = (T[]) (new Object[capacity]);
        index = 0;
    }

    public String getName() {
        return name;
    }
    public T[] getStudents() {
        return students;
    }
    public void add(T t) {
        students[index++] = t;
        /*
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
        */
    }
}