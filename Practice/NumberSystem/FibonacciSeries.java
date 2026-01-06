package NumberSystem;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10; // Number of terms to print
        fibo(num);
    }

    static void fibo(int num) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(a);
            if (i < num) {
                System.out.print(", ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
