package Other;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        int remainder = 0;
        if (x > 0) {
            while (x > 0) {
                remainder = x % 10;
                rev = rev * 10 + remainder;
                x = x / 10;
            }
            if (temp == rev) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 10;
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println(sol.isPalindrome(num));
    }
}