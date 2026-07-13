package Java_Concepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9, 8, 9, 10 };
        List<Integer> list = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).limit(1).collect(Collectors.toList());
        System.out.println(list);

        System.out.println(Arrays.stream(arr).max().getAsInt());

    }
}
