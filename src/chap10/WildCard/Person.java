package chap10.WildCard;

public class Person {
    private String name;
    public Person(String status) {
        this.name = status;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
