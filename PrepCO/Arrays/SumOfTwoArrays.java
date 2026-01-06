package PrepCO.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 4, 9, 8, 4, 7, 3, 2 };
        int[] arr2 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // sumOfTwoArrays(arr1, arr2);
        System.out.println("main method");
    }

    static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        int[] sumArr = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sumArr.length - 1;
        int carry = 0;
        while (k >= 0) {
            if (i >= 0) {
                sumArr[k] += i + carry;
                System.out.println(i + "i if");
            }
            if (j >= 0) {
                sumArr[k] += j;
            }
            if (sumArr[k] >= 10) {
                carry = sumArr[k] / 10;
                sumArr[k] = sumArr[k] % 10;
            }
            i--;
            k--;
            j--;
        }
        for (int x = 0; x < sumArr.length; x++) {
            System.out.println(sumArr[x]);
        }
        return 0;
    }

    static {
        System.out.println("this is static block");
    }
}

// static int sumOfTwoArrays(int[] arr1, int[] arr2) {
// int maxLength = Math.max(arr1.length, arr2.length);
// int minLength = Math.min(arr1.length, arr2.length);
// int[] maxArray;
// int[] minArray;
// if (maxLength == arr1.length) {
// maxArray = arr1;
// minArray = arr2;
// } else {
// maxArray = arr2;
// minArray = arr1;
// }
// ArrayList<Integer> arrayList = new ArrayList<Integer>();
// int temp = minLength - 1;
// for (int i = maxLength - 1; i >= 0; i--) {
// // System.out.println(arr1[i]);
// if (temp >= 0) {
// arrayList.add((maxArray[i] + minArray[temp]));

// } else {
// arrayList.add(maxArray[i]);
// }
// temp--;
// }
// for (int i = arrayList.size() - 1; i >= 0; i--) {
// System.out.println(arrayList.get(i));
// }
// return 0;
// }