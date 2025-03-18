package chap11;

import java.util.*;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendKakaoTalk", "you"));
        messageQueue.offer(new Message("sendMail", "me"));
        messageQueue.offer(new Message("sendSMS", "parent"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.getCommand()) {
                case "sendSMS" -> System.out.println(message.getTo() + "에게 문자를 보냅니다.");
                case "sendMail" -> System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                case "sendKakaoTalk" -> System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
            }
        }
    }
}
