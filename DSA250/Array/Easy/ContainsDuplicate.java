package DSA250.Array.Easy;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr) {

        int index = 0;
        int p = 1;
        while (index < arr.length && p < arr.length) {
            if (arr[index] == arr[p]) {
                return true;
            }
            if (p == arr.length - 1) {
                index++;
                p = index + 1;
            }
            p++;
        }
        return false;
    }
}
