package chap11;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return age + name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return this.age == member.age && this.name.equals(member.name) ;
        }
        return super.equals(obj);
    }
}
