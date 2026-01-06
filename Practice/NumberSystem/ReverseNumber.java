package NumberSystem;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 32164;
        System.out.println("Reversed Number:- " + reversedNumber(num));
    }

    static int reversedNumber(int num) {
        int rev = 0;
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;
        }
        return rev;
    }
}
