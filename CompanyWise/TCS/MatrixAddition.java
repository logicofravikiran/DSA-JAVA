package CompanyWise.TCS;

import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:- ");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns:- ");
            int c = sc.nextInt();

            int[][] m1 = new int[r][c];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1.length; j++) {

                    System.out.print("Enter element for the position (" + (i + 1) + "," + (j + 1) + ")");
                    m1[i][j] = sc.nextInt();
                }
            }
            int[][] m2 = new int[r][c];
            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m1.length; j++) {

                    System.out.print("Enter element for the position (" + (i + 1) + "," + (j + 1) + ")");
                    m2[i][j] = sc.nextInt();
                }
            }

            System.out.println("enter key");
            int rr = sc.nextInt();
            int cc = sc.nextInt();

            System.out.println("Internal Marks: ");
            for (int i = 0; i < m1.length; i++) {
                System.out.println(Arrays.toString(m1[i]));
            }
            System.out.println("Internal Marks: ");

            for (int i = 0; i < m1.length; i++) {
                System.out.println(Arrays.toString(m1[i]));
            }

            output(m1, m2, rr, cc);
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    private static void output(int[][] m1, int[][] m2, int rr, int cc) {
        int ans = m1[rr - 1][cc - 1] + m2[rr - 1][cc - 1];
        System.out.println(ans);
    }
}
