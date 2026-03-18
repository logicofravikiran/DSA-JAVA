package Naive_Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        System.out.println(
                isArmstrongNumber(num));
        sc.close();
    }

    private static boolean isArmstrongNumber(int num) {
        int newNum = 0;
        int og = num;
        String str = String.valueOf(num);
        int power = str.length();
        while (num > 0) {
            newNum += Math.pow(num % 10, power);
            num /= 10;
        }
        if (og == newNum) {
            return true;
        } else {
            return false;
        }
        // return false;
    }
}
