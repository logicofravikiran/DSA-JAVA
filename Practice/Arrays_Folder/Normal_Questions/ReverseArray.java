package Arrays_Folder.Normal_Questions;

public class ReverseArray {
    int[] reversedArray(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        ReverseArray obj = new ReverseArray();
        int[] rev = obj.reversedArray(arr);
        for (int i = 0; i < rev.length; i++) {
            System.out.println(rev[i]);
        }
    }
}
