package NumberSystem;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 16161;
        if (isPalindrome(num)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Plaindrome Number");
        }
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;
        }
        if (temp == rev) {
            return true;
        }
        return false;
    }
}
