package ImpClass;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        InterfaceDemo interfaceDemo = () -> System.out.println("Hello");

        // Consumer
        Consumer<String> stringConsumer = (String x) -> System.out.println("THe string is: " + x);
        stringConsumer.accept("Yogesh");

        // Supplier
        Supplier<String> stringSupplier = () -> "hello";
        System.out.println(stringSupplier.get());

        // Function
        Function<Integer, String> integerStringFunction = (Integer i) -> "The integer is: " + i;
        System.out.println(integerStringFunction.apply(21));

        // Predicate
        Predicate<Integer> integerPredicate = (Integer i) -> true;
        System.out.println(integerPredicate.test(23));
    }
}
