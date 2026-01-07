package Recursion;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        int num = 10;
        pDI(num);
    }

    private static void pDI(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        pDI(num - 1);
        System.out.println(num);
    }
}
