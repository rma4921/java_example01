package chap09;

public class ATM {
    public static void main(String[] args) {
        int inputMoney = 3000000;
        Acount acount = new Acount(1000000);

        try {
            acount.withdraw(inputMoney);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }

    }
}
