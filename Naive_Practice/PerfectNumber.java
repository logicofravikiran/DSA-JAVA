package Naive_Practice;

// Perfect number = sum of its perfect divisors
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("perfect");
        } else {
            System.out.println("not perfect");
        }
    }
}
