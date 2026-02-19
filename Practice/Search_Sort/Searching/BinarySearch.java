package Arrays_Folder.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int find = 9;

        int presence = -1;
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        int mid = 0;

        for (int i = start; i < end; i++) {
            count++;
            mid = (start + end) / 2;

            if (arr[i] == find) {
                presence = i;
                break;
            } else {
                if (find == arr[mid]) {
                    presence = mid;
                    break;
                } else if (find < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if (presence != -1) {
            System.out.println("Element present at index: " + presence);
        } else {
            System.out.println("Element not present");
        }
        System.out.println("iterations:- " + count);
    }
}
