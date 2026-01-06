package Arrays_Folder.Normal_Questions;

public class Merge2SortedArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 5, 6, 11 };
        int arr2[] = { 4, 7, 9, 12, 15 };
        int arr[] = mergedArr(arr1, arr2);
    }

    static int[] mergedArr(int[] arr1, int[] arr2) {
        int maxLen = 0;
        if (arr1.length > arr2.length) {
            maxLen = arr1.length;
        } else {
            maxLen = arr2.length;
        }
        int count = 0;
        int resArr[] = new int[arr1.length + arr2.length - 2];
        int resCount = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resArr[resCount] = arr1[i];
                i++;
                resCount++;
            } else {
                resArr[resCount] = arr2[j];
                j++;
                resCount++;
            }
        }
        for (int x = 0; x < resArr.length; x++) {
            System.out.println(resArr[x]);
        }
        System.out.println(count + " count");
        return arr1;
    }
}
