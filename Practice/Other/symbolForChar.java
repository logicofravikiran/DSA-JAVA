package Other;

import java.util.Scanner;

public class symbolForChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num >= 0 && num < 128) {
            System.out.println(num + "-" + (char) num);
        }
        sc.close();
    }
}
