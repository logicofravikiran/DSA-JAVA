package Naive_Practice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        factorial(num);
        sc.close();
    }

    private static void factorial(int num) {
        List<Integer> list = new LinkedList<>();

        int original = num;
        int divider = 2;

        while (num >= 1) {
            if (num == 1) {
                break;
            }
            if (num % divider == 0) {
                list.add(divider);
                num /= divider;
                divider = 2;
            } else {
                divider++;
            }
        }
        if (list.isEmpty()) {
            list.add(num);
        }

        System.out.print(original + ":- ");

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));

            } else {
                System.out.print(list.get(i) + " * ");
            }
        }
    }
}
