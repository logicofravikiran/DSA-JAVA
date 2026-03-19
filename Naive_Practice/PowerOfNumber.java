package Naive_Practice;

public class PowerOfNumber {
    public static void main(String[] args) {
        int num = 10;
        int power = 4;

        int result = 1;
        for (int i = 0; i < power / 2; i++) {
            result *= num * num;
        }
        if (power % 2 == 1) {
            result *= num;
        }
        // for (int i = 0; i < power; i++) {
        // result *= num;
        // }
        System.out.println(result);
    }
}
