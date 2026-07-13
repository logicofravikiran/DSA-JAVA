package Java_Concepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9, 8, 9, 10, 12 };
        List<Integer> list = Arrays.stream(arr).filter(x -> x > 10).limit(1).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
