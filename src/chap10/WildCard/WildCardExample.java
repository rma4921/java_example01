package chap10.WildCard;

import java.util.ArrayList;
import java.util.Arrays;

public class WildCardExample {

    public static void printCourse(Course<?> course) {
        System.out.println(course.getName() + ": " + Arrays.toString(course.getStudents()));
    }
    public static void printStudentCourse(Course<? extends Student> course) {
        System.out.println(course.getName() + ": " + Arrays.toString(course.getStudents()));
    }
    public static void printWorkerCourse(Course<? super Worker> course) {
        System.out.println(course.getName() + ": " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인 과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 4);
        highStudentCourse.add(new HighStudent("고딩1"));

        Course<Student> studentCourse = new Course<>("학생 과정", 4);
        studentCourse.add(new Student("학생 1"));
        studentCourse.add(new HighStudent("고등학생 1"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 4);
        workerCourse.add(new Worker("직딩 1"));

        // Course<?> course
        printCourse(personCourse);
        printCourse(workerCourse);
        printCourse(studentCourse);
        printCourse(highStudentCourse);

        // Course<? extends Student> course
        printStudentCourse(studentCourse);
        printStudentCourse(highStudentCourse);

        // Course<? super Worker> course
        printWorkerCourse(workerCourse);
        printWorkerCourse(personCourse);
    }
}
