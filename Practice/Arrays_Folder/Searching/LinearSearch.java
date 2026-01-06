package Arrays_Folder.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + ":-");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to search:- ");
        int find = sc.nextInt();
        sc.close();
        // int x = sc.nextInt();
        boolean presence = false;
        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                presence = true;
                break;
            }
        }
        if (presence) {
            System.out.println("Element present");
        } else {
            System.out.println("Not present");
        }

    }
}
