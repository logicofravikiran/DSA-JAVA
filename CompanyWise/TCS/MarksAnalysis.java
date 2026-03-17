package CompanyWise.TCS;

import java.util.*;

/*Question 2: Student Marks Analysis (Medium - 60 Minutes)

Problem Statement

A school maintains marks of students in multiple subjects in a 2D matrix.

Each row represents one student.
Each column represents one subject.

You are given:

· An integer N -> number of students

. An integer M > number of subjects

. A matrix of size N x M representing marks

A student is considered Pass if:

They score strictly above the average marks of that subject in at least one subject.

Your task is to determine the total number of students who pass. */

public class MarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students:- ");
        int rows = sc.nextInt();

        System.out.print("Enter number of subjects:- ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Student " + i + " marks in :");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter marks for Subject " + j + " :- ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println("-------");
        }
        sc.close();

        System.out.println("Marks Matrix: Students vs Subjects");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int count = countOfPassedStudents(matrix);
        System.out.println(count);
    }

    private static int countOfPassedStudents(int[][] matrix) {
        int count = 0;
        double[] averages = new double[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }

            averages[i] = (double) (sum / matrix.length);
            System.out.println(averages[i]);

        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= averages[j]) {
                    count++;
                    System.out.println("Student: " + (i + 1) + "for marks:- " + matrix[i][j]);
                    break;
                }
            }
        }

        return count;
    }
}
