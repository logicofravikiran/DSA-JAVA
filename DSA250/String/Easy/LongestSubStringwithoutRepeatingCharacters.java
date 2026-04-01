package DSA250.String.Easy;

public class LongestSubStringwithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestString(s));
    }

    private static int longestString(String s) {
        int left = 0;
        int right = 1;
        int maxLen = Integer.MIN_VALUE;
        while (left < right && right < s.length()) {
            if (s.substring(left, right).indexOf(s.charAt(right)) == -1) {
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                left++;
                right++;
                maxLen = Math.max(maxLen, right - left + 1);
            }
            if (right == s.length()) {
                left++;
                right = left + 1;
            }
        }
        return maxLen;
    }
}
