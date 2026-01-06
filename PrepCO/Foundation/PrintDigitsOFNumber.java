package PrepCO.Foundation;

public class PrintDigitsOFNumber {
    public static void main(String[] args) {
        int num = 0014523;
        int count = 0;
        int temp = num;
        while (num > 0) {
            num /= 10;
            count++;
        }
        int divisor = (int) Math.pow(10, count - 1);
        while (temp > 0) {
            System.out.println(temp / divisor);
            temp = temp % divisor;
            divisor /= 10;
        }

        // while (num > 0) {
        // // System.out.println(num % 10);
        // rev = rev * 10 + num % 10;
        // num /= 10;
        // }

        // System.out.println(rev);
        // while (rev > 0) {
        // System.out.println(rev % 10);
        // rev /= 10;
        // }
    }
}
