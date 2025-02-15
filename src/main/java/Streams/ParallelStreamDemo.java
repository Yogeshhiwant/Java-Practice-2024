package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        // A type of stream that enables parallel processing of the elements.
        // A parallel stream allows multiple threads to operate simultaneously.
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads.


        long l1 = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(10000).collect(Collectors.toList());
        List<Long> factorials = list.stream().map(ParallelStreamDemo::factorial).toList();
        long l2 = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (l2 - l1) + " ms");

        long l3 = System.currentTimeMillis();
        List<Integer> list2 = Stream.iterate(1, x -> x + 1).limit(10000).collect(Collectors.toList());
        List<Long> factorials2 = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        long l4 = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (l4 - l3) + " ms");

        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        // Cumulative Sum
        // [1, 2, 3, 4, 5] --> [1, 3, 6, 10, 15]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.stream().sequential().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum: [1, 3, 6, 10, 15]");
        System.out.println("Actual result with parallel stream: " + cumulativeSum);

    }


    private static long factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
