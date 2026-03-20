package Naive_Practice;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "11110";
        int power = binary.length() - 1;
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power--;
        }

        System.out.println(decimal);
    }
}
