package DSA250.String.Easy;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'a', 's', 'd', 'f', 'g', 'h' };

        int n = s.length - 1;
        char temp = 'a';
        for (int i = 0; i <= n / 2; i++) {
            temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }

        System.out.println(Arrays.toString(s));
    }
}
