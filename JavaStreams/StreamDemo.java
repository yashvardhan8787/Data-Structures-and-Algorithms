package JavaStreams;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //streams features are introduced in Java 8
        // processing collections of objects in a functional style
        //Streams can be created from collections, arrays, or I/O channels
        //Streams support operations like filter, map, reduce, and collect
        //Example: Using streams to filter and collect elements from a list

        //what is stream?
        //A stream is a sequence of elements supporting sequential and parallel aggregate operations.
        //Streams do not store data, they operate on data from a source (like a collection)


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        //Filter even numbers and collect them into a new list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .toList(); // Collect to a list
        System.out.println("Even Numbers: " + evenNumbers);


        //Creating streams
        //1. From a collection
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        names.stream()
                .filter(name -> name.startsWith("A")) // Filter names starting with 'A'
                .forEach(System.out::println); // Print each name

        //2. From an array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        Stream<String> fruitStream = Stream.of(fruits);
        fruitStream
                .filter(fruit -> fruit.length() > 5) // Filter fruits with more than 5 characters
                .forEach(System.out::println); // Print each fruit

        // using stream.of()

        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream
                .map(n -> n * n) // Square each number
                .forEach(System.out::println); // Print each squared number

        //4.infinite streams
        //Creating an infinite stream of natural numbers
        Stream<Integer> naturalNumbers = Stream.iterate(1, n -> n + 1).limit(100); // Infinite stream of natural numbers
        naturalNumbers
                .filter(n -> n % 2 == 0) // Filter even numbers
                .limit(10) // Limit to the first 10 even numbers
                .forEach(System.out::println); // Print each even number

        //genrate
        Stream<Integer> generatedNumbers = Stream.generate(() -> (int) (Math.random() * 100)).limit(10); // Generate random numbers
        generatedNumbers
                .filter(n -> n > 50) // Filter numbers greater than 50
                .forEach(System.out::println); // Print each number greater than 50


    }
}
