package Arrays_Folder.Normal_Questions;

public class TrialReverseArray {
    public static void main(String[] args) {
        int arr[] = { 12, 55, 2, 8, 6 };
        reversedArray(arr);
    }

    static void reversedArray(int[] arr) {
        int n = arr.length - 1; // 4
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("}");
    }
}
