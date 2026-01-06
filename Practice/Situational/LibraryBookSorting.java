package Situational;

import java.util.ArrayList;

public class LibraryBookSorting {
    public static void main(String[] args) {
        String str = "asdf";
        char[] chArr = str.toCharArray();
        ArrayList<Integer> asciiArr = new ArrayList<>();
        for (int i = 0; i < chArr.length; i++) {
            asciiArr.add((int) chArr[i]);
        }
        asciiArr.sort(null);
        System.out.println(asciiArr);
        int count = 0;
        for (int i = 0; i < chArr.length; i++) {
            if ((int) chArr[i] != asciiArr.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}