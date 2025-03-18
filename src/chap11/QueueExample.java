package chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("100");
        queue.offer("200");
        queue.offer("300");

        System.out.println("Use peek");
        System.out.println(queue.peek());

        System.out.println("Queue value");
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
