package chap11;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("Servlet/JSP");
        list.add("Spring");
        list.add("DBMS");
        list.add("JPA");

        System.out.println("list 크기: " + list.size());
        System.out.println("list.get(2): " + list.get(2));

        list.remove("Servlet/JSP");

        System.out.println("list 출력");
//        for(String str : list) {
//            System.out.print("\t" + str);
//        }
        for(int index = 0; index < list.size(); index++) {
            System.out.print(index + ": " + list.get(index) + "\t");
        }
        System.out.println();

    }
}
