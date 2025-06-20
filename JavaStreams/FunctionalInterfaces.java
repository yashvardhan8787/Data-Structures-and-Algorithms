package JavaStreams;

import java.util.ArrayList;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        t1.start();
        Function <Integer , Integer> squareFunction = (Integer x) -> x * x;
        System.out.println(            "Square of 5 is: " + squareFunction.apply(5)
        );

        Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0;
        System.out.println("Is 4 even? " + isEvenPredicate.test(4));

        Consumer<Integer> printConsumer = (Integer x) -> System.out.println("Value: " + x);
        printConsumer.accept(10);

        BiFunction<Integer, Integer, Integer> addFunction = (Integer a, Integer b) -> a + b;
        System.out.println("Sum of 3 and 4 is: " + addFunction.apply(3, 4));

        BiConsumer<Integer, String> printWithMessage = (Integer x, String message) -> System.out.println(message + x);
           printWithMessage.accept(20, "The value is: ");

        BiPredicate<Integer, Integer> isGreater = (Integer a, Integer b) -> a > b;
        System.out.println("Is 5 greater than 3? " + isGreater.test(5, 3));

        UnaryOperator<Integer> doubleValue = (Integer x) -> x * 2;
        System.out.println("Double of 10 is: " + doubleValue.apply(10));

        ArrayList <String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.forEach(name -> System.out.println("Name: " + name));

        // Using method references
        names.forEach(System.out::println);


    }
}
