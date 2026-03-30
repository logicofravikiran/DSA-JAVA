package DSA250.String.Easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "race a car";
        isPalindrome(s);
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll(" |,|:", "");
        System.out.println(s);
        int n = s.length() - 1;
        if (s.length() < 1) {
            return true;
        }
        for (int i = 0; i <= n / 2; i++) {
            System.out.println("Compared:- " + s.charAt(i) + " & " + s.charAt(n - i));
            if (s.charAt(i) != s.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }
}
