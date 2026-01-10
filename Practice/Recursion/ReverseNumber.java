package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 10111;
        System.out.println(reverseNumber(num, 0));
        // printIncreasing(num);
    }

    private static int reverseNumber(int num, int rev) {
        if (num == 0) {
            return rev;
        }

        return reverseNumber(num / 10, rev * 10 + (num % 10));
    }
}
