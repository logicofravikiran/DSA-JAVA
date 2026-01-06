package Situational;

public class PasswordDistanceProblem {
    public static void main(String[] args) {
        String str = "abc10";
        int len = str.length();
        System.out.println(maxDistance(str, len));
    }

    static int maxDistance(String str, int len) {
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return (len - i - 1);
            }
        }
        return 0;
    }
}
