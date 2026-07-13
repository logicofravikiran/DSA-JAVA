package Java_Concepts.StreamNew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 5, 3, 3, 4, 56, 2 };
        Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> filterList = list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
    }
}
