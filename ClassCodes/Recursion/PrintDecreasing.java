package ClassCodes.Recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        int n = 10;
        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            System.out.println(n);
            printDecreasing(n - 1);
        }
    }
}
