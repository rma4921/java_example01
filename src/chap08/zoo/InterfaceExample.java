package chap08.zoo;

public class InterfaceExample {
    public static void main(String[] args) {
        Zookeeper2 zookeeper = new Zookeeper2();
        Predator tiger = new Tiger2();
        Predator lion = new Lion2();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);
    }
}

interface Predator {
    public String getFood();
}

class Zookeeper2 {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
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