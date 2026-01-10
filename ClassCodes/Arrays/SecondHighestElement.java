package ClassCodes.Arrays;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 4, 3, 2, 4, 5, 7, 8, 65, 4, 3, 5, 6, 8, 90, 0 };
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("NO second Highest");
        } else {
            System.out.println(secondHighest);
        }
    }
}
