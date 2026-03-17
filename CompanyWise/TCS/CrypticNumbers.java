package CompanyWise.TCS;

import java.util.*;

/*Cryptic Numbers (Easy - 30 Minutes)

Problem Statement

You are given two integers L and R, representing a range of numbers (inclusive).

A number is called a Cryptic Number if it satisfies all of the following conditions:

1. It is divisible by 7.

2. It is not divisible by 5.

3. It is not a palindrome.

It does not contain any repeated digits.

Your task is to print all cryptic numbers in the given range.

If no such number exists, print -1. */

public class CrypticNumbers {

    public static void main(String[] args) {
        int start = 100;
        int end = 120;

        isCryptic(start, end);
    }

    private static boolean isPalindromeOrRepeating(int n) {

        int original = n;
        Set<Integer> set = new HashSet<>();

        int remainder;
        int reverse = 0;

        while (n > 0) {

            remainder = n % 10;

            if (set.contains(remainder)) {
                return true; // repeated digit
            }

            set.add(remainder);

            reverse = reverse * 10 + remainder;

            n /= 10;
        }

        if (reverse == original) {
            return true; // palindrome
        }

        return false;
    }

    private static void isCryptic(int start, int end) {

        boolean found = false;

        for (int i = start; i <= end; i++) {

            if (i % 7 == 0 && i % 5 != 0) {

                if (!isPalindromeOrRepeating(i)) {

                    System.out.println(i);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}