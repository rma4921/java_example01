package chap10;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> returnValue = new Box<>();
        returnValue.set(t);
        return returnValue;
    }
    public static <T extends Number> int compare(T t1, T t2) {
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();
        return Double.compare(d1, d2); // d1, d2가 박싱되어 Double로 오토박싱 된다.
        // primitive type은 generic에 허용되지 않기 때문
    }
}
