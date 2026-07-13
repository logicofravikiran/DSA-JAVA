public class trail {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

        int n = str.length() - 1;
        boolean isPalindrome = false;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                isPalindrome = false;
                break;
            }
        }

    }
}
