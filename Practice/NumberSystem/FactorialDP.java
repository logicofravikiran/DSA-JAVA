package NumberSystem;

public class FactorialDP {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }

    static int fact(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
