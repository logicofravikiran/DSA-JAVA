package ClassCodes.Recursion;

public class SumOfNNumbers {
    // int currentSum = 0;
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOFNumbers(n);
        // System.out.println(sum);
        int currentSum = 0;
        paraSumOfNumbers(n, currentSum);
    }

    private static int sumOFNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOFNumbers(n - 1);
    }

    private static void paraSumOfNumbers(int n, int currentSum) {
        if (n == 0) {
            System.out.println(currentSum);
            return;
        }
        paraSumOfNumbers(n - 1, currentSum + n);
    }
}
