package Arrays_Folder.Normal_Questions;

import java.util.*;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        int count = matrix.length * matrix[0].length;

        List<Integer> list = new LinkedList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack stack = new Stack<>();

        int i = 0;
        int j = 0;
        while (count > 0) {
            System.out.println(matrix[i][j]);

            // list.add(matrix[i][j]);
            if (j < matrix[i].length - 1) {
                j++;
            } else if (i < matrix.length - 1) {
                i++;
            }
            count--;
        }
    }
}
