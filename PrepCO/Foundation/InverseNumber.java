package PrepCO.Foundation;

// import java.util.Arrays;
import java.util.Scanner;

public class InverseNumber {
    // public static void main(String[] args) { //my approach
    // int num = 81456273;
    // int temp = num;
    // int[] arr = new int[8];
    // int i = 1;
    // while (num > 0) {
    // arr[(num % 10) - 1] = i;
    // num /= 10;
    // i++;
    // }
    // System.out.println(Arrays.toString(arr));
    // num = 0;
    // for (int j = arr.length - 1; j >= 0; j--) {
    // num = num * 10 + arr[j];
    // }
    // System.out.println(num);
    // }

    public static void main(String[] args) { // ideal approach
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        int inverseNumber = 0;
        while (num > 0) {
            inverseNumber = inverseNumber + i * (int) Math.pow(10, (num % 10) - 1);
            num /= 10;
            i++;
        }
        System.out.println(inverseNumber);
    }
}
