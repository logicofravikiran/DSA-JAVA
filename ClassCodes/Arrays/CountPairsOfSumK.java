package ClassCodes.Arrays;

public class CountPairsOfSumK {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, -3, 7, 8, 15, 6, 13 };
        int k = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
