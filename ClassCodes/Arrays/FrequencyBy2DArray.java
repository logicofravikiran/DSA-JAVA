package ClassCodes.Arrays;

import java.util.Arrays;

public class FrequencyBy2DArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 5, 4, 3 };
        int target = 5;

        int[][] freq = new int[arr.length][2];

        for (int i = 0; i < freq.length; i++) {
            freq[i][0] = arr[i];
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println(Arrays.toString(freq[i]));
        }
        System.out.println("---------------");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] == -1) {
                continue;
            }
            int num = arr[i];
            freq[i][1] = 1;
            for (int j = i + 1; j < freq.length; j++) {
                if (arr[j] == num) {
                    freq[i][1] += 1;
                    freq[j][1] = -1;
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println(Arrays.toString(freq[i]));
        }

        System.out.println("--------------");

        // sorting the elements descending frequency

        for (int i = 0; i < freq.length; i++) {
            int f = freq[i][1];
            for (int j = i + 1; j < freq.length; j++) {
                if (f < freq[j][1]) {
                    int ele = freq[i][0];
                    int eleFreq = freq[i][1];

                    freq[i][0] = freq[j][0];
                    freq[i][1] = freq[j][1];

                    freq[j][0] = ele;
                    freq[j][1] = eleFreq;
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println(Arrays.toString(freq[i]));
        }
        System.out.println("---------------");
        int[] result = new int[freq.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = freq[i][0];
        }
        int ans = -1;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == target) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
