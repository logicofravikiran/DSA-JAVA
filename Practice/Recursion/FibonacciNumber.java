package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(fiboNumber(num));
    }

    private static int fiboNumber(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fiboNumber(num - 1) + fiboNumber(num - 2);
        }
    }

}
