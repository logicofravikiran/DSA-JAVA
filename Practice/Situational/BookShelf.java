package Situational;

public class BookShelf {
    public static void main(String[] args) {
        int limit = 5;
        int arr[] = { 3, 7, 5, 6 };
        System.out.println(maxBooksCanRead(arr, limit));
    }

    static int maxBooksCanRead(int[] arr, int limit) {
        int maxBookReadable = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("iteration of " + i);
            boolean isPrime = false;
            if (i + 1 == 2) {
                isPrime = true;
            }
            for (int j = 2; j < i + 1; j++) {
                if ((i + 1) % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                    System.out.println((i + 1) + "is prime");
                }
            }
            if (isPrime) {
                System.out.println("checking for i= " + i);
                if (limit <= arr[i]) {
                    maxBookReadable += limit;
                    System.out.println("isprime in if");
                } else {
                    System.out.println("isprime in else");
                    maxBookReadable += arr[i];
                }
                // maxBookReadable += arr[i];
            }
            System.out.println("------------");
        }
        return maxBookReadable;
    }
}
