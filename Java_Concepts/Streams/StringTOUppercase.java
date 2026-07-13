package Java_Concepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTOUppercase {
    public static void main(String[] args) {
        String[] arr = { "Anvi", "Arav", "Vedant", "Aishwarya", "Usha", "Anuj" };
        List<String> list = Arrays.stream(arr).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);
    }
}
