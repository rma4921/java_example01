package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("Servlet/JSP");
        set.add("Java"); // set에서 중복 요소는 저장 X
        set.add("DBMS");
        System.out.println("총 객체 수: " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        set.remove("DBMS");
        set.remove("Spring");
        System.out.println("총 객체 수: " + set.size());
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("set is empty");
        }
    }
}
