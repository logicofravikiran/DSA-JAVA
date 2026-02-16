package Sliding_Window;

import java.util.*;

public class longestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String str = "cadbzabcd";
        System.out.println(lengthOfLongestSubstringWithoutRepeatingCharacters(str));
    }

    private static int lengthOfLongestSubstringWithoutRepeatingCharacters(String str) {

        int minLength = Integer.MAX_VALUE;
        Set<Character> charSet = new HashSet<>();

        int left = 0;
        int right = 0;

        while (left <= right && right < str.length()) {
            System.out.println("str.charAt(right):- " + str.charAt(right));
            if (charSet.contains(str.charAt(right))) {
                System.out.println("in if");
                minLength = Math.min(minLength, right - left);
                System.out.println("minLength:- " + minLength + " left:- " + left);
                left++;
            }
            charSet.add(str.charAt(right));
            right++;
            System.out.println("-----------------");
        }
        return minLength;
    }
}