package chap11;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<>();
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(150));
        coinStack.push(new Coin(10));
        coinStack.push(new Coin(1));
        coinStack.push(new Coin(5));

        System.out.println("Print Stack value");
        while (!coinStack.isEmpty()) {
            Coin coin = coinStack.pop(); // coinStack.peek()과의 차이? peek은 객체를 큐에서 제거 X
            System.out.println(coin.getValue() + "원");
        }
    }
}
