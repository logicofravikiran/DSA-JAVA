package Java_Concepts.StreamNew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingElements {
    public static void main(String[] args) {


        List<Integer> integers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10,1,2,3,30,0);
        System.out.println(integers);
        List<Integer> integerList = integers.stream().map(x -> x/2).toList();
        System.out.println(integerList);

        integerList.stream().distinct().forEach(System.out::println);

        integerList.stream().distinct().sorted((a,b)->(b-a)  ).forEach(System.out::println);


    }
}
