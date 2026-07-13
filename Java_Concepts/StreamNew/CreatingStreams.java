package Java_Concepts.StreamNew;

import java.util.*;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

        // Arrays.stream(arrayname)
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(arr).filter(n -> n % 2 == 1).sum();
        System.out.println(sum);

        // collectionObjectName.stream();
        List<String> list = Arrays.asList("Apple", "Banana", "Pineapple");
        Stream<String> stream = list.stream();

        // Stream.iterate
        // Return first 100 even Numbers
        Stream<Integer> numbers = Stream.iterate(0, n -> n + 2).limit(100);
        numbers.forEach(System.out::println);

        // Stream.of()
        Stream.of(1, 2, 3, 4, 5);
        // stream.forEach(System.out::println);

        // Stream.generate(Supplier<T> )
        Stream.generate(() -> "hello").limit(4).forEach(System.out::println);
        Stream.generate(() -> (int) Math.random()).limit(50).forEach(System.out::println);
        ;

    }
}
