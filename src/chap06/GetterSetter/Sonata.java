package chap06.GetterSetter;

public class Sonata {
    private double speed = 0;
    private boolean status = false;

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setStop(boolean status) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }
    public double getSpeed() {
        return this.speed;
    }
    public boolean isStop() {
        return this.status;
    }
    public static void main(String[] args) {
        Sonata sonata = new Sonata();

        // 잘못된 속도 변경
        sonata.setSpeed(-50);
        System.out.println("현재 속도: " + sonata.getSpeed());

        // 올바른 속도 변경
        sonata.setSpeed(60);
        System.out.println("변경 후 속도: " + sonata.getSpeed());

        // 멈춤
        if (!sonata.isStop()) {
            sonata.setStop(true);
        }

        System.out.println("멈춤 후 속도: " + sonata.getSpeed());
    }
}