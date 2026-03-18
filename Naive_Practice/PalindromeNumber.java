package Naive_Practice;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }

    private static boolean isPalindrome(int num) {
        int og = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (og == rev) {
            return true;
        } else {
            return false;
        }
    }
}
