package CompanyWise.IBM;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str.toLowerCase()));
    }

    private static boolean isPalindrome(String str) {
        int len = str.length() - 1;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i)) {
                return false;
            }
        }
        return true;
    }
}
