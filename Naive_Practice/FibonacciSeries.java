package Naive_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Fibo terms:- ");
        int terms = sc.nextInt();
        fiboSeries(terms);
        sc.close();
    }

    private static void fiboSeries(int terms) {
        int[] result = new int[terms];
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < terms; i++) {
            result[i] = a;

            c = a + b;
            a = b;
            b = c;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result));
        }
    }
}
