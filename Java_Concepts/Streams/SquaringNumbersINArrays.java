package Java_Concepts.Streams;

import java.util.*;
// import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SquaringNumbersINArrays {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 3, 8, 4, 7, 3, 7, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4);
        // map and filter
        List<Integer> intList = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
        System.out.println(intList);

        // distinct
        List<Integer> distinctEleList = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctEleList);

        // sorted
        List<Integer> newList = distinctEleList.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(newList);

        // limit
        // newList.stream().limit(2).forEach(System.out::println);

        // skip
        System.out.println("skip");
        newList.stream().skip(3).forEach(System.out::println);

    }
}
