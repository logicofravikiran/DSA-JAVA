package Arrays_Folder.Normal_Questions;

public class FindMissingNumber {
    static int missingNumber(int[] arr) {
        for (int i : arr) {
            if (arr[i] != (i + 1)) {
                return i + 1;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != (i + 1)) {
        // return i + 1;
        // }
        // }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
        System.out.println("Missing Number:- " + missingNumber(arr));
    }
}
