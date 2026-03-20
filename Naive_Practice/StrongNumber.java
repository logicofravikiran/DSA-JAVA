package Naive_Practice;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 142;
        System.out.println(isStrongNumber(num));

    }

    private static boolean isStrongNumber(int num) {

        int og = num;
        int sum = 0;

        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        if (og == sum) {
            return true;
        }
        return false;
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

}
