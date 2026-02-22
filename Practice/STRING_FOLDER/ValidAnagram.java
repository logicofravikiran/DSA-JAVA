import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String str, String target) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        target = target.replaceAll("\\s", "").toLowerCase();

        // Length check
        if (str.length() != target.length()) {
            return false;
        }

        // Convert to char arrays
        char[] arr1 = str.toCharArray();
        char[] arr2 = target.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str = sc.nextLine();

        System.out.print("Enter second string: ");
        String target = sc.nextLine();

        if (isAnagram(str, target)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}
