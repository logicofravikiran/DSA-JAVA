public class DecimalToAnyBase {
    public static void main(String[] args) {
        int decNum = 634;
        int octNum = decimalToOctal(decNum);
        System.out.println(octNum);
    }

    public static int decimalToOctal(int decNum) {
        int octNum = 0;
        int power = 0;
        while (decNum > 0) {
            System.out.println("before, decNum:- " + decNum);
            octNum += decNum % 8 * (int) Math.pow(10, power);
            System.out.println("OctNum:- " + octNum);
            decNum /= 8;
            System.out.println("after, decNum:- " + decNum);
            System.out.println("---------iteration----------" + (power + 1));
            power++;
        }
        return octNum;
    }
}
