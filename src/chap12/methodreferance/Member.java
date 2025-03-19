package chap12.methodreferance;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
        System.out.println("생성자(id) : " + this.id + " 호출");
    }
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("생성자(id, name) " + this.id + ", " + this.name + " 호출");
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
