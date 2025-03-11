package chap07.overload;

public class HouseDog extends Dog{
    void sleep(int hour) {
        System.out.println(name + "Zzz... for " + hour);
    }
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("puppy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
