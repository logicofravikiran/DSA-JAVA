package Naive_Practice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:- ");
        int year = sc.nextInt();
        if (year > 9999 || year < 1) {
            System.out.println("invalid input year \nEnter Year between 1 to 9999");
            year = sc.nextInt();
        }
        System.out.println(isLeapYear(year));
        sc.close();
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
