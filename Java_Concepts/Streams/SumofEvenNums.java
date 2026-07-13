package Java_Concepts.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumofEvenNums {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(arr).filter(x -> x % 2 == 0).sum();
        System.out.println(sum);
    }
}
