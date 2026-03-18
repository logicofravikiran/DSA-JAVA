package Naive_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Rows:- ");
        int r = sc.nextInt();

        System.out.print("Enter number of Columns:- ");
        int c = sc.nextInt();

        int[][] m1 = new int[r][c];

        System.out.println("Enter Elements of Matrix 1: ");
        // input of Matrix
        for (int i = 0; i < r; i++) {
            System.out.println("Enter Elements in row:- " + i);
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        // Printing Matrix 1
        for (int i = 0; i < m1.length; i++) {
            System.out.println(Arrays.toString(m1[i]));
        }

        int[][] transpose = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = m1[j][i];
            }
        }

        for (int i = 0; i < c; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }

        sc.close();
    }
}
