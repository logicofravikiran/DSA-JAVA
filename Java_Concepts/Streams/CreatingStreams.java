package Java_Concepts.Streams;

import java.util.*;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // Stream of a collection
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        // list.stream().forEach(System.out::print);

        // Stream of Arrays
        // int[] arr = { 60, 44, 70, 333, 80, 232, 90 };
        // Arrays.stream(arr).filter(x -> x % 10 == 0).forEach(System.out::println);

        // Stream.of("Ravi", "Kiran", "Dnyandev",
        // "Shinde").forEach(System.out::println);

        // System.out.println();

        // Stream.iterate(0, n -> n + 1).limit(5).forEach(System.out::println);

        Stream<Integer> stream = Stream.generate(() -> (int) Math.random()).limit(100);
        stream.forEach(System.out::println);
    }
}
