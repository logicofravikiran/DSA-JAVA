package NumberSystem;

public class PrimeNumber {
    static int count = 0;

    static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num == 1 || num % 2 == 0) {
            return false;
        }

        // Only check odd divisors up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            System.out.println(i);
            count++;
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 565;

        if (isPrime(num)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
        System.out.println(count);
        // System.out.println(isPrime(num));
    }
}

// package NumberSystem;

// class PrimeNumber {

// public static void main(String[] args) {
// int num = 4;
// System.out.println(isPrime(num));
// }

// static boolean isPrime(int num) {
// if (num == 1) {
// return false;
// }
// if (num == 2) {
// return true;
// }
// if (num % 2 == 0) {
// return false;
// }

// for (int i = 3; i * i < num; i += 2) {
// if (num % i == 0) {
// return false;
// }
// System.out.println(i);
// }
// return true;
// }
// }
