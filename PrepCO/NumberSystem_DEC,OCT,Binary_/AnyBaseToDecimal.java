public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int num = 1172;
        int base = 8;
        int decNum = anyBasetoDecimal(num, base);
        System.out.println(decNum);
    }

    static int anyBasetoDecimal(int num, int base) {
        int decNum = 0;
        int power = 0;
        while (num > 0) {
            decNum += num % 10 * (int) Math.pow(base, power);
            num /= 10;
            power++;
        }
        return decNum;
    }
}
