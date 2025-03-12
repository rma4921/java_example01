package chap08.zoo;

public class ClassExample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);
    }
}
class Zookeeper {

    public void feed(Tiger tiger) {
        System.out.println("feed meat");
    }
    public void feed(Lion lion) {
        System.out.println("feed fish");
    }
    public void feed(Crocodile crocodile) {
        System.out.println("feed apple");
    }
    public void feed(Leopard leopard) {
        System.out.println("feed orange");
    }
}
class Tiger {

}
class Lion {

}
class Crocodile {

}
class Leopard {

}