package NumberSystem;

public class GCD_LCM {
    static int greatestCommonDivisor(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if (max % min == 0) {
            return min;
        }
        for (int i = min; i > 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int lowestCommonMultiple(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return max;
        }
        int i = max;
        while (true) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int a = 41;
        int b = 42;
        System.out.println(greatestCommonDivisor(a, b));
        System.out.println(lowestCommonMultiple(a, b));
    }
}
