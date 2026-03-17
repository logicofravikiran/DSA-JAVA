package Naive_Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = sc.nextInt();

        sc.close();

        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
