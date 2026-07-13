package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print(" \t");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" \t");
            }
            for (int j = rows * 2 - 1; j > (i + 1) * 2; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}