package Naive_Practice;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        String str = "";

        while (decimal > 0) {
            str = (decimal % 2) + str;
            decimal /= 2;
        }
        System.out.println(str);
    }
}
