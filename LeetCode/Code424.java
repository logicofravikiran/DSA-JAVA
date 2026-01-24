package LeetCode;

import java.util.HashMap;

public class Code424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        // longestRepeatingCharacterReplacement(s,k);
        checkFrequencyOfCharacters(s);
    }

    public static int longestRepeatingCharacterReplacement(String s, int k) {

        return 0;
    }

    public static int findIndex(String s, int k) {
        int index = 0;
        HashMap hm = new HashMap<>();
        int gapCount = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(i)) {
                    gapCount++;
                }
            }
            if (!hm.containsKey(s.charAt(i)) && gapCount <= k) {
                hm.put(s.charAt(i), gapCount);
            }
        }
        return 0;
    }

    public static void checkFrequencyOfCharacters(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                num = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++num);
                System.out.println(s.charAt(i) + " in if " + num);
            } else if (!hm.containsKey(s.charAt(i))) {
                num = 0;
                hm.put(s.charAt(i), ++num);
                System.out.println(s.charAt(i) + " in else " + num);
            }
        }

        System.out.println(hm);
    }
}
