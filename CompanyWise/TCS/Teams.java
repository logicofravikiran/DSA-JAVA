package CompanyWise.TCS;

import java.io.*;
import java.util.*;

public class Teams {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter total employees:- ");
            int e = Integer.parseInt(br.readLine().trim());

            System.out.println("Enter team size: ");

            int t = Integer.parseInt(br.readLine().trim());

            System.out.println("Enter Skill levels:- ");

            String s = br.readLine().trim();

            String[] parts = s.split("\\s+");
            // System.out.println(Arrays.toString(parts));
            int[] arr = new int[e];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            System.out.println(Arrays.toString(arr));

            teamCord(arr, e, t);
            br.close();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    private static void teamCord(int[] arr, int e, int t) {
        Arrays.sort(arr);

        int[] diffs = new int[e / t];
        int minEle = 0;
        int maxEle = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % t == 1) {
                minEle = arr[i];
            } else if ((i + 1) % t == 0) {
                maxEle = arr[i];
                diffs[index] = maxEle - minEle;
                index++;
            }
        }

        Arrays.sort(diffs);
        int ans = diffs[diffs.length - 1];
        System.out.println(ans);
    }
}
