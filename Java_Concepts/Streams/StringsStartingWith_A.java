package Java_Concepts.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringsStartingWith_A {
    public static void main(String[] args) {
        String[] arr = { "Anvi", "Arav", "Vedant", "Aishwarya", "Usha", "Anuj" };
        List<String> list = Arrays.stream(arr).filter(s -> s.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(list);
    }
}
