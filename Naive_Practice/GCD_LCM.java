package Naive_Practice;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number2:- ");
        int n2 = sc.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println(gcd);
        int lcm = lcm(n1, n2);
        System.out.println(lcm);
        sc.close();
    }

    private static int gcd(int n1, int n2) {
        if (n1 == n2) {
            return n1;
        }
        int large = Math.max(n1, n2);
        int small = Math.min(n1, n2);
        // int gcd = 1;
        for (int i = small; i > 0; i--) {
            if (large % i == 0 && small % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private static int lcm(int n1, int n2) {
        int gcd = gcd(n1, n2);

        return (n1 * n2 / gcd);
    }
}
