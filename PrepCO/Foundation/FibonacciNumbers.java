package PrepCO.Foundation;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int num = 10;
        printFiboNumbers(num);
    }

    static void printFiboNumbers(int num) {
        int a = 0;
        int b = 1;
        int temp = 0;
        for (int i = 0; i < num; i++) {
            System.out.println(a); // 0 1
            temp = a + b; // 1 3
            a = b; // 1 2
            b = temp; // 2 3
        }
    }
}