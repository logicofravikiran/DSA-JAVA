package Arrays_Folder.Normal_Questions;

public class SecondHighestElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 4, 45, 99 };
        int highest = arr[0];
        int secondHighest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            }
        }
        System.out.println(secondHighest);
    }
}

// chat gpt code
// package Arrays_Folder.Normal_Questions;

// public class SecondHighestElement {
// public static void main(String[] args) {
// int arr[] = { 10, 20, 4, 45, 99 };

// int highest = Integer.MIN_VALUE;
// int secondHighest = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > highest) {
// secondHighest = highest;
// highest = arr[i];
// } else if (arr[i] > secondHighest && arr[i] < highest) {
// secondHighest = arr[i];
// }
// }

// if (secondHighest == Integer.MIN_VALUE) {
// System.out.println("No second highest element");
// } else {
// System.out.println(secondHighest);
// }
// }
// }
