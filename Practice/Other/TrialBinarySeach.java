package Other;

public class TrialBinarySeach {

    static int count = 0;

    boolean isPresent(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        for (int i = start; i < end; i++) {
            mid = (start + end) / 2;
            TrialBinarySeach.count++;
            if (arr[i] == target || target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        TrialBinarySeach obj = new TrialBinarySeach();
        boolean isPresent = obj.isPresent(arr, target);
        System.out.println(isPresent);
        System.out.println(count);
    }
}
