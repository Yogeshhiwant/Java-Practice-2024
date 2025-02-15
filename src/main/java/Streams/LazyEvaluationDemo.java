package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 6);
        Stream<Integer> stream = integers.stream().filter(x -> {
            System.out.println("Filtering " + x);
            return x % 2 == 0;
        });
        System.out.println("before terminal operation");

        Set<Integer> collect = stream.collect(Collectors.toSet());
        System.out.println("after terminal operation"+ collect);

    }
}
