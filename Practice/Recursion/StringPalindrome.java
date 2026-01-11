package Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "ravivar ";
        int index = 0;
        System.out.println(checkPalindrome(str, index));
        // checkPalindrome(str,index);
    }

    private static boolean checkPalindrome(String str, int index) {
        str = str.trim();
        if (index == str.length()) {
            return true;
        }
        if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
            return false;
        }
        checkPalindrome(str, index + 1);
        return true;
    }
}