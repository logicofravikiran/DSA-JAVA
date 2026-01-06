package PrepCO.Arrays;

public class CountSmallerElements {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8, 1, 7, 3, 2, 8 };
        // countSmallerElements(arr);
        System.out.println(countSmallerElements(arr));
    }

    static int countSmallerElements(int[] arr) {
        int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[i] < arr[j]) {
        // count++;
        // System.out.println("counted:- " + arr[i]);
        // break;
        // }
        // }
        // }

        // --------OR--------------
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                countMax++;
            }
        }
        count = arr.length - countMax;
        return count;
    }
}
