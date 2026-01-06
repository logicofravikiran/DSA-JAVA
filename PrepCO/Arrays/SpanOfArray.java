package PrepCO.Arrays;

import java.util.*;

public class SpanOfArray {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter " + (1) + "th element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Span--> " + (max - min));
    }
}