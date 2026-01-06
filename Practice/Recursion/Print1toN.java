package Recursion;

public class Print1toN {

    public static void main(String[] args) {
        int num = 67;
        printNumbers(1, num);
    }

    public static void printNumbers(int current, int num) {
        if (current > num) {
            return;
        }

        System.out.println(current);
        printNumbers(current + 1, num);
    }
}
