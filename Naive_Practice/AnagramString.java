package Naive_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        str1 = Arrays.toString(charArray1);
        str2 = Arrays.toString(charArray2);

        if (str1.equals(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
