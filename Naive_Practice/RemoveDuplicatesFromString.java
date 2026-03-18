package Naive_Practice;

import java.util.Scanner;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeDuplicates(str);
        sc.close();
    }

    private static void removeDuplicates(String str) {
        // ArrayList ar = new ArrayList<>(Arrays.asList(str.toCharArray()));
        // ar.sort();
        // ! Logic 1:
        // List<Character> list = new ArrayList<>();

        // char ch = 'a';
        // for (int i = 0; i < str.length(); i++) {
        // ch = str.charAt(i);
        // if (list.contains(str.charAt(i))) {
        // continue;
        // } else {
        // list.add(str.charAt(i));
        // }
        // }
        // System.out.println(list);

        // ! logic 2:-
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
