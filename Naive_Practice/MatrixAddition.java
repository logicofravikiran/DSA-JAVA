package Naive_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows:- ");
        int r = sc.nextInt();
        System.out.print("Enter number of Columns:- ");
        int c = sc.nextInt();
        int[][] m1 = new int[r][c];
        System.out.println("Enter Elements of Matrix 1: ");
        for (int i = 0; i < r; i++) {
            System.out.println("Enter Elements in row:- " + i);
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        int[][] m2 = new int[r][c];
        System.out.println("Enter Elements of Matrix 2: ");
        for (int i = 0; i < r; i++) {
            System.out.println("Enter Elements in row:- " + i);
            for (int j = 0; j < c; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }

        sc.close();

    }
}
