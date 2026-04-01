package ClassCodes.Recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 5;
        String name = "Raghav";
        printName(name, n);
    }

    private static void printName(String name, int n) {

        if (n == 1) {
            System.out.println(name);
            return;
        } else {
            printName(name, n - 1);
        }
    }

}
