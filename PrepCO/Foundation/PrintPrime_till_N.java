package PrepCO.Foundation;

public class PrintPrime_till_N {
    public static void main(String[] args) {
        int low = 6;
        int high = 24;
        for (int i = low; i <= high; i++) {
            printPrimeNumbers(i);
        }
    }

    static void printPrimeNumbers(int num) {
        if (num == 2) {
            System.out.print(num + "\t");
        }
        if (num == 1 || num % 2 == 0) {
            return;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return;
            }
        }
        System.out.print(num + "\t");
    }
}
