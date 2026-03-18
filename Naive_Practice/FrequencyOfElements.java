package Naive_Practice;

// import java.util.Scanner;

import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array:- ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter " + length + " elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

        sc.close();
    }
}
