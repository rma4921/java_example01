package chap08.basic;

public class Order {
    public static void main(String[] args) {
        double amount = 100.34;

        Payment creditCard = new CreditCard("948-2281");
//        //CreditCard creditCard = new CreditCard("948-2281");
        creditCard.processPayment(amount);
//
        Payment paypal = new Paypal("tester@est.com");
//        //Paypal paypal = new Paypal("tester@naver.com");
        paypal.processPayment(amount);

        pay("creditCard", amount);
    }
    static void pay(String paymentMethod, double amount){
        Payment payment;
        if (paymentMethod.equals("creditCard")) {
            payment = new CreditCard("1234-5656");
        } else {
            payment = new Paypal("oreumi@est.com");
        }
        payment.processPayment(amount); // 다형성
    }
}
