package Naive_Practice;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your StringL:- ");
        String str = sc.nextLine();
        countVowels_Consonants(str);
        sc.close();
    }

    private static void countVowels_Consonants(String str) {
        str = str.toLowerCase();
        int countVowels = 0;
        int countConso = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                countVowels++;

            } else if (str.charAt(i) > 96 && str.charAt(i) <= 122) {
                countConso++;
            }
        }

        System.out.println("Vowels:- " + countVowels);
        System.out.println("Consonants:- " + countConso);
    }
}
