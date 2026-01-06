package PrepCO.Foundation;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:- ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            System.out.println(
                    isPrime(num) ? "Prime Number" : "Not a Prime Number");
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num == 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i < num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
