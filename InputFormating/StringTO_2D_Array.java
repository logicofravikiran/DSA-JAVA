package InputFormating;

import java.util.Arrays;

public class StringTO_2D_Array {
    public static void main(String[] args) {
        String str = "1,     2, 3, 4, 5, 6";
        int columns = 2;
        int rows = 3;
        String[] nums = str.split(",");
        int[][] matrix = new int[rows][columns];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(nums[index++].trim());
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
