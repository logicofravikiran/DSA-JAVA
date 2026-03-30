package DSA250.String.Easy;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        for (int i = 0; i < tArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }

        return true;
    }
}
