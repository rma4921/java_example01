package chap07.overload;

public class HouseDog extends Dog{
    void sleep(int hour) {
        System.out.println(name + "Zzz... for " + hour);
    }
}
