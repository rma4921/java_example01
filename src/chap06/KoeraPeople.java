package chap06;

public class KoeraPeople {
    final String nation = "Korea";
    final String language;
    static final int population = 1000000000;

    String name;

    KoeraPeople(String name) {
        this.name = name;
        language = "Java World";
    }
    public static void main(String[] args) {
        KoeraPeople people = new KoeraPeople("이름");

        System.out.println(people.name);
        System.out.println(people.nation);
    }
}
