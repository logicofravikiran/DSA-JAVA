package Core2web.Arrays;

//print the sums of pairs(i,n-i)th elements in array
public class SumPairs {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (arr.length % 2 == 1 && i == n / 2) {
                System.out.println("Middle Element is:- " + arr[i]);
                // break;
            } else {
                System.out.println("Sum of " + i + "th & " + (n - i) + " th element is :- " + (arr[i] + arr[n - i]));
            }
        }
    }
}
