package LeetCode;

public class Code7ReverseInt {

    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        Code7ReverseInt obj = new Code7ReverseInt();
        System.out.println(obj.reverse(x)); // 0
    }
}
