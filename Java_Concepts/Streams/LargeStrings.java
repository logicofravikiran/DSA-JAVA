package Java_Concepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargeStrings {
    public static void main(String[] args) {
        String[] arr = { "Anvi", "Arav", "Vedant", "Aishwarya", "Usha", "Anuj" };
        List<String> list = Arrays.stream(arr).filter(s -> s.length() > 5).collect(Collectors.toList());
        System.out.println(list);
    }
}
