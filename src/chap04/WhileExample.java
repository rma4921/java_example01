package chap04;

public class WhileExample {
    public static void main(String[] args){
        int i = 1;
        while (i <= 30) {
            System.out.print(i + " ");
            i++;
        }
        int treeHit = 1;
        while (treeHit < 10) {
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            treeHit++;
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 30);
    }
}
