package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sumOfNumbers(num));
    }

    private static int sumOfNumbers(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sumOfNumbers(num - 1);
        }
    }
}