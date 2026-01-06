package PrepCO.Arrays;

public class CountRepetitionsOfElements {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 7, 5, 2, 4, 1, 5, 3, 2, 5, 3, 4, 9 };
        coutnRepetitions(arr);
    }

    static void coutnRepetitions(int[] arr) {
        int totalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean continueCount = true;
            // System.out.println("iteration:- " + i);
            if (i != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] == arr[j]) {
                        // System.out.println("in return wala if");
                        // System.out.println("i:- " + i + " && j:- " + j);
                        continueCount = false;
                    }
                }
            }
            if (continueCount) {
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        totalCount++;
                    }
                }
                System.out.println("Count of " + arr[i] + " is:- " + count);
            }
            // System.out.println(totalCount);
            if (totalCount == arr.length) {
                break;
            }
        }
    }
}
