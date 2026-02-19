package CompanyWise.IBM;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = { Integer.MIN_VALUE, 5, Integer.MAX_VALUE };
        System.out.println(secondLargest_Array(arr));
    }

    private static int secondLargest_Array(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        } else {

            return secondMax;
        }
    }
}
