package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int num = 48;
        printNumbers(num);
    }

    public static void printNumbers(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printNumbers(num - 1);
    }
}
