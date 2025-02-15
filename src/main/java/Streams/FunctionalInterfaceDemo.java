package Streams;

import java.util.List;
import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

//------------------------------------------ Predicate --> boolean test(T t)  -----------------------------------------------------------------
        // Predicate is a functional interface.
        // It contains boolean test(T t) abstract method.
        // Predicate holds the condition whether it is "true" or "false".
        // <T> – the type of the input to the predicate.


        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        Predicate<String> isStringStartsWithA = x -> x.toLowerCase().startsWith("A");
        Predicate<String> isStringEndsWithA = x -> x.toLowerCase().endsWith("A");

        System.out.println(isStringEndsWithA.and(isStringStartsWithA).test("Anita"));
        System.out.println(isStringStartsWithA.test("Aishwarya"));

//------------------------------------------ Function --> R apply(T t); -----------------------------------------------------------------

        // Function is a functional interface.
        // It contains R apply(T t); abstract method.
        // Function holds the value.
        // <T> – the type of the input to the function
        // <R> – the type of the result of the function

        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> trippleIt = x -> 3 * x;

        System.out.println(doubleIt.apply(20));
        System.out.println(doubleIt.andThen(trippleIt).apply(10));


//------------------------------------------ Consumer --> void accept(T t); -----------------------------------------------------------------

        // Consumer is a functional interface.
        // It contains void accept(T t); abstract method.
        // <T> – the type of the input to the operation.

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);

        Consumer<List<Integer>> printList = x -> {
            for (Integer i : x) {
                System.out.println(i);
            }
        };
        printList.accept(List.of(1, 2, 3));

//------------------------------------------ Supplier --> T get(); -----------------------------------------------------------------

        // Supplier is a functional interface.
        // It contains T get(); abstract method.
        // <T> – the type of the input to the operation.

        Supplier<String> giveHelloWorld = () -> "Hello World !";
        System.out.println(giveHelloWorld.get());


        // Combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 10;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

//------------------------------------- BiPredicate, BiConsumer, BiFunction ---------------------------------------------

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> (x + y) % 2 == 0;
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        System.out.println(biPredicate.test(2, 5));
        System.out.println(biFunction.apply("Yogesh", "Hiwant"));
        biConsumer.accept(2, 5);

//-------------------------- UnaryOperator and BinaryOperator -----------------------------------------------------

        UnaryOperator<Integer> square = x -> x * x;
        BinaryOperator<Integer> sub = (x, y) -> x - y;
    }
}
