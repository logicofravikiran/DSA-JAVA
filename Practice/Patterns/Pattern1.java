package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int rows = 4;
        printPattern(rows);
    }

    static void printPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" " + "\t");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
