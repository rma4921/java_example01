package chap08.defaultmethod;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper2 zookeeper = new Zookeeper2();
        Predator tiger = new Tiger2();
        Predator lion = new Lion2();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);
    }
}

class Zookeeper2 {
    void feed(Predator predator) {
        predator.printFood();
    }
}
class Tiger2 implements Predator {
    public String getFood(){
        return "meet";
    }
}
class Lion2 implements Predator {
    public String getFood(){
        return "fish";
    }
}
class Crocodile2 implements Predator {
    public String getFood(){
        return "apple";
    }
}
class Leopard2 implements Predator {
    public String getFood(){
        return "orange";
    }
}