package chap08.abst;

public class ImplementC implements InterfaceC {

    @Override
    public void methodC() {
        System.out.println("ImplementC.methodC");
    }
    @Override
    public void methodA() {
        System.out.println("ImplementC.methodA");
    }
    @Override
    public void methodB() {
        System.out.println("ImplementC.methodB");
    }

    public static void main(String[] args) {
        InterfaceA interfaceA = new ImplementC(); // methodA만 사용 가능
        InterfaceB interfaceB = new ImplementC(); // methodB만 사용 가능
        ImplementC implementC = new ImplementC();

        interfaceA.methodA();
        System.out.println("====================");
        interfaceB.methodB();
        System.out.println("====================");
        implementC.methodA();
        implementC.methodC();
        implementC.methodB();

    }
}
