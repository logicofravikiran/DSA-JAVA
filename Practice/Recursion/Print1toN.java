package Recursion;

public class Print1toN {

    public static void main(String[] args) {
        int num = 67;
        printNumbers(num);
    }

    public static void printNumbers(int num) {
        if (num == 0) {
            return;
        }
        printNumbers(num - 1);
        System.out.println(num);
    }
}
