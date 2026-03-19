package Naive_Practice;

public class MissingInteger {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 10;

        boolean isMiddleMissing = true;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != i) {
                System.out.println(i);
                break;
            } else if (i == n) {
                isMiddleMissing = false;
            }
        }
        if (!isMiddleMissing) {

            System.out.println(n);
        }
    }
}
