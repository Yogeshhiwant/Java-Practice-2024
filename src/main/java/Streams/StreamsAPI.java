package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI {

    // Streams API was introduced in Java 8/1.8.
    // Streams ---> sequence of elements supporting various operations.
    // Source ---> intermediate operations ---> terminal operation

    // Streams API was introduced to minimize the coding
    // Lambda expressions, FunctionalInterface, Method reference
    // Streams process collections of data in a functional and declarative manner.


    public static void main(String[] args) {

        List<String> list = Arrays.asList("Yogesh", "Ram", "Shyam", "Sanket", "Varun");
        List<Integer> integers = Arrays.asList(1, 23, 45, 34, 12, 2, 32, 99, 80, 86, 67);

//        System.out.println(integers.stream().filter(x -> x % 2 == 0).count());
//        System.out.println(integers.stream().filter(x -> x % 2 != 0).count());

        Stream<Integer> limit = Stream.generate(() -> 1).limit(100);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());


        System.out.println(integers.stream().collect(Collectors.averagingInt(x -> x)));
        System.out.println(integers.stream().collect(Collectors.counting()));
        System.out.println(integers.stream().collect(Collectors.summarizingInt(x -> x)));

        System.out.println(list.stream().collect(Collectors.mapping(String::toUpperCase,Collectors.toList())));
    }
}
