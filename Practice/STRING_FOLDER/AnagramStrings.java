
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public boolean isAnagram(String str, String target) {
        char arr[] = str.toCharArray();
        Arrays.sort(arr);

        char targetArr[] = target.toCharArray();
        Arrays.sort(targetArr);

        boolean isAnagram = false;

        if (str.length() != target.length()) {
            return false;
        }

        for (int i = 0; i < targetArr.length; i++) {
            if (arr[i] == targetArr[i]) {
                isAnagram = true;
            } else {
                isAnagram = false;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:- ");
        String str = sc.next();

        System.out.print("Enter a String:- ");
        String target = sc.next();
        sc.close();
        AnagramStrings obj = new AnagramStrings();

        if (obj.isAnagram(str, target)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}