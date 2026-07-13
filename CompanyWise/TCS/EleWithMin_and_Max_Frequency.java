package CompanyWise.TCS;

import java.util.*;

public class EleWithMin_and_Max_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:- ");
        String s = sc.nextLine();

        String[] parts = s.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(chatMethod(arr));
    }

    private static String elementswithMinAndMaxFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer key : map.keySet()) {
            min = Math.min(min, map.get(key));
            max = Math.max(max, map.get(key));
        }
        System.out.println(min);
        System.out.println(max);
        return "";
    }

    private static String chatMethod(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int minElement = -1;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            if (freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }
        }

        System.out.println(minElement + " " + maxElement);
        return minElement + " " + maxElement;
    }
}
