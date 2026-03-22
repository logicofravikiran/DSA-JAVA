package DSA250.Array.Easy;

/*A phrase is a palindrome if, after converting all uppercase letters into 
lowercase letters and removing all non-alphanumeric characters, it reads the 
same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise */

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(istPalindrome(str));
    }

    private static boolean istPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[ ,:]", "");
        int n = str.length() - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }
}
