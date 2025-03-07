package chap05;

public class TwoDimensionArrayExample {
    public static void main(String[] args){
        int [][] arrays = new int [][]{
                {1, 2, 3},
                {3, 4, 5}
        };
        // 아래 방식과 위 방식이 동일함.
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[0][2] = 3;
        arrays[1][0] = 3;
        arrays[1][1] = 4;
        arrays[1][2] = 5;
    }
}
