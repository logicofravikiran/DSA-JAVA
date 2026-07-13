package Arrays_Folder.Normal_Questions;

public class MinSizeSubArrSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        int minSize = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int size = 0;
            int sum = arr[i];
            if (sum == target) {
                minSize = 1;
                System.out.println("returned from here");
                return;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    size = j - i;
                    minSize = Math.min(minSize, size);
                } else if (sum > target) {
                    break;
                }
            }
        }

        System.out.println(minSize);
    }
}
