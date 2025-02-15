package Collections;

import java.util.function.Predicate;

public class StreamsAPIDemo {

    public static void main(String[] args) {

        // Predicate is a functional interface.
        // It contains boolean test(T t) abstract method.
        // Predicate holds the condition whether it is "true" or "false".


        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

    }
}
