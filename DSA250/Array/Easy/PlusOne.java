package DSA250.Array.Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 9, 9, 9, 1 };
        // plusOne(digits);
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        int carry = 0;
        int sum = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                sum = digits[i] + 1;
            } else {
                sum = digits[i] + carry;
                carry = 0;
            }
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            }
            digits[i] = sum;
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        } else {
            return digits;
        }
    }
}
