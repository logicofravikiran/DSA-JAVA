package Situational;

import java.util.Arrays;

class AlexReadingProblem {

    public static int maxBooks(int[] A, int N, int size) {
        // Sort the array to read books with smaller time first
        Arrays.sort(A);

        int count = 0;
        int totalTime = 0;

        for (int i = 0; i < size; i++) {
            if (totalTime + A[i] <= N) {
                totalTime += A[i];
                count++;
            } else {
                break; // If adding the next book exceeds the limit, stop
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int[] A = { 4, 2, 3, 1 };
        int N = 5;
        int size = 4;
        System.out.println(maxBooks(A, N, size)); // Output: 2
    }
}
