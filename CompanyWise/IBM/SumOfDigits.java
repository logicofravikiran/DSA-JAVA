package CompanyWise.IBM;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 3456;
        System.out.println(sumDigits(num));
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
