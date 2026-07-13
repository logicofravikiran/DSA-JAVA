package ClassCodes.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        // System.out.println(factorialOfN(n));
        paraFactorial(n, 1);
    }

    private static int factorialOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialOfN(n - 1);
    }

    private static void paraFactorial(int n, int currentFact) {
        if (n == 1) {
            System.out.println(currentFact);
            return;
        }
        paraFactorial(n - 1, n * currentFact);
    }
}