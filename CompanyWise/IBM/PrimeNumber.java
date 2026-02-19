package CompanyWise.IBM;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 83;
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num == 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i < num; i++) {
            System.out.println(i);
            if (num % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
