package Recursion;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 56789;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num) {

        if (num == 0) {
            return 0;
        } else {
            return 1 + countDigits(num / 10);
        }
    }
}
