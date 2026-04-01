package ClassCodes.Recursion;

public class BacktrackPrintIncreasing {
    public static void main(String[] args) {
        int n = 10;
        backtrackAndPrintIncreasing(n, n);
    }

    private static void backtrackAndPrintIncreasing(int i, int n) {
        if (i == 1) {
            System.out.println(i);
            return;
        }
        backtrackAndPrintIncreasing(i - 1, n);
        System.out.println(i);
    }
}
