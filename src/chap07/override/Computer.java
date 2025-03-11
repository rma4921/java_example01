package chap07.override;

public class Computer extends Calculator {

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer.areaCircle()");
        return r * r * Math.PI;
    }
}
