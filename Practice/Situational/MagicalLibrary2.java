package Situational;

public class MagicalLibrary2 {
    public static void main(String[] args) {
        int col = 3;
        int row = 3;
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println(arr[1][2]);
        System.out.println(totalMagicalRows(col, row, arr));
    }

    static int totalMagicalRows(int col, int row, int[][] arr) {
        int totalRows = 0;
        // int oddSum = 0;
        for (int i = 0; i < row; i++) {
            int oddSum = 0;
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 1) {
                    oddSum += arr[i][j];
                    System.out.println(arr[i][j]);
                }
            }
            if (oddSum % 2 == 0) {
                System.out.println("oddsum: " + oddSum);
                totalRows++;
            }
        }
        return totalRows;
    }
}
