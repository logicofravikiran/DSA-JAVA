package PrepCO.Foundation;

public class CountDigits {
    public static void main(String[] args) {
        int num = 00000453;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
