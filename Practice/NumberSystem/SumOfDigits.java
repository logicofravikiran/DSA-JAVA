package NumberSystem;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 92387;
        System.out.println(sumOfDigits(num));
    }

    static int sumOfDigits(int num) {
        int remainder = 0;
        int sum = 0;
        while (num > 0) {
            remainder = num % 10;
            sum += remainder;
            num /= 10;

        }
        return sum;
    }
}
