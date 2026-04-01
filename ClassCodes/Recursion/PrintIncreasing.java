package ClassCodes.Recursion;

public class PrintIncreasing {
    public static void main(String[] args) {
        int n = 10;
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            printIncreasing(n - 1);
            System.out.println(n);
        }
    }
}
