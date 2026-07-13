package CompanyWise.TCS;
// ajinkya shift 2nd question

import java.io.*;
import java.util.*;

/*A hospital stores the number of visits made by each patient in an array.

Write a Java program to:

Read the number of patients (n)
Read n integers representing the number of visits
Sort the array in descending order
Search for a given number of visits (key)
Print the index of the key in the sorted array (print -1 if not found) */

public class PatientsVisits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            String[] parts = str.split("\\s+");
            int[] arr = new int[parts.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            System.out.println(sortByFrequency(arr, k));

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        br.close();

    }

    private static int sortByFrequency(int[] arr, int target) {
        int n = arr.length;
        int freq[][] = new int[n][2];

        // Initialize freq array
        for (int i = 0; i < n; i++) {
            freq[i][0] = arr[i];
            freq[i][1] = 0;
        }

        // Count frequency
        for (int i = 0; i < n; i++) {

            if (freq[i][1] == -1)
                continue; // already counted

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == freq[j][0]) {
                    count++;
                    freq[j][1] = -1; // mark duplicate
                }
            }

            freq[i][1] = count;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println(Arrays.toString(freq[i]));
        }

        // Print result
        for (int i = 0; i < n; i++) {
            if (freq[i][1] != -1) {
                System.out.println(freq[i][0] + " --> " + freq[i][1]);
            }
        }

        // Step 3: Sort freq array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare frequency (descending)
                if (freq[j][1] < freq[j + 1][1] ||

                        (freq[j][1] == freq[j + 1][1] &&
                                freq[j][0] > freq[j + 1][0])) {

                    // swap both element & frequency
                    int temp1 = freq[j][0];
                    int temp2 = freq[j][1];

                    freq[j][0] = freq[j + 1][0];
                    freq[j][1] = freq[j + 1][1];

                    freq[j + 1][0] = temp1;
                    freq[j + 1][1] = temp2;
                }
            }
        }

        // Step 4: Create new array
        int result[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (freq[i][1] != -1) {
                result[k++] = freq[i][0];
            }
        }

        // Print new array
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 5: Find index of target
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (result[i] == target) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
        return ans;
    }
}
