package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("닝닝");
        set.add("카리나");
        set.add("윈터");

//        for (String member : set) {
//            System.out.println(member);
//        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("size: " + set.size());
        // set.clear()
        // set.remove("윈터")
    }
}
