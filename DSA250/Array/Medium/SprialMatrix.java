package DSA250.Array.Medium;

import java.util.*;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // List<Integer> result = spiralOrder(matrix);
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int index = (matrix.length * matrix[0].length) - 1;
        System.out.println(index);
        int mi = 0;
        boolean isHorizantal = true;
        boolean isVertical = false;

        while (index >= 0) {
            System.out.println("i:- " + i + ", j:- " + j + ", mi:- " + mi);
            if (matrix[i][j] != -1) {
                result.add(matrix[i][j]);
                matrix[i][j] = -1;
            }

            if (isHorizantal && mi == matrix.length - 1) {
                System.out.println("Reverse Horizontal");
                if (j > 0) {
                    j--;
                }
            }

            else if (isHorizantal) {
                System.out.println("HorizontaL");
                if (j != matrix[0].length - 1) {

                    j++;
                } else if (j == matrix[0].length - 1) {
                    isHorizantal = false;
                    isVertical = true;
                }
            } else if (isVertical && mi > 0) {
                if (i > 0) {
                    i--;
                }
            } else if (isVertical) {
                System.out.println("Vertical");
                if (i != matrix.length - 1) {
                    i++;
                    mi++;
                } else if (i == matrix.length - 1) {
                    isVertical = false;
                    isHorizantal = true;
                }
            }
            System.out.println(result);
            System.out.println("-------------------");
            index--;
        }
        return result;
    }
}

// && i < matrix.length && j < matrix[0].length
