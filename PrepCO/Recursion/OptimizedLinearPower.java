package Recursion;

public class OptimizedLinearPower {
    public static void main(String[] args) {
        int num = 5;
        int power = 3;
        System.out.println(optimizedPower(num, power));
    }

    private static int optimizedPower(int num, int power) {
        if (power == 0) {
            return 1;
        }
        int halfPower = optimizedPower(num, power / 2);
        int wholePower = halfPower * halfPower;
        if (power % 2 == 1) {
            wholePower = num * wholePower;
        }
        return wholePower;
    }
}
