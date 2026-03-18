package Naive_Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:- ");

        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
        sc.close();
    }

    private static int reverseNumber(int num) {
        int rem = 0;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
