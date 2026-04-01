package DSA250.String.Easy;

public class LongestSubStringwithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longestString(s));
    }

    private static int longestString(String s) {
        int left = 0;
        int right = 1;
        int maxLen = Integer.MIN_VALUE;
        while (left < right && right < s.length()) {
            System.out.println("character:-  " + s.charAt(right) + " left:- " + left + " right:- " + right);
            if (s.substring(left, right).indexOf(s.charAt(right)) == -1) {
                System.out.println("in if");
                maxLen = Math.max(maxLen, right - left);
                right++;
            } else {
                System.out.println("else");
                left++;
                right++;
            }
            if (right == s.length()) {
                left++;
                right = left + 1;
                System.out.println("end left:- " + left + " right:- " + right);
            }

            System.out.println("maxlength:- " + maxLen);

        }
        return maxLen;
    }
}
