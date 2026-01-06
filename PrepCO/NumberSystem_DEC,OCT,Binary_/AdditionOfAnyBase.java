public class AdditionOfAnyBase {
    public static void main(String[] args) {
        int num1 = 157;
        int num2 = 724;
        int base = 8;
        int sum = sumOfAnyBase(num1, num2, base);
        System.out.println(sum);
    }

    static int sumOfAnyBase(int num1, int num2, int base) {
        int carry = 0;
        int sum = 0;
        int power = 0;
        while (num1 > 0 && num2 > 0 && carry != 0) {
            int rem = (num1 % 10) + (num2 % 10) + carry;

            if (rem > 7) {
                carry++;
                rem = rem - 8;
                sum += rem * (int) Math.pow(base, power);
            }
        }

        return sum;
    }
}
