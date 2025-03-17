package chap11;

import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 86);
        map.put("카리나", 85);
        map.put("제시카", 95);
        map.put("홍길동", 80);
        System.out.println("map size: " + map.size());

        System.out.println("key가 카리나: " + map.get("카리나")); // key에 해당하는 값이 없으면 null
        System.out.println("tester: " + map.getOrDefault("tester", -9999)); // key에 해당하는 값이 없으면 기본값 반환
        System.out.println(map.containsKey("홍길동"));

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println("======================");
        map.remove("홍길동");

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }

        map.clear();
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }
    }
}
