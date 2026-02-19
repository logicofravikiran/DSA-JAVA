package CompanyWise.IBM;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 39000001;

        System.out.println(reversedNumber(num));
    }

    private static int reversedNumber(int num) {

        int actualNum = num;
        num = Math.abs(num);

        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        if (actualNum >= 0) {
            return reversed;
        } else {
            return -reversed;
        }
    }
}