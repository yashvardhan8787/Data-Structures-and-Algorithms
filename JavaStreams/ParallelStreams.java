package JavaStreams;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        // Example usage of parallel streams in Java
        var numbers = java.util.stream.IntStream.range(1, 100)
                .parallel()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toArray();

        System.out.println("Squared even numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


    //about parallel streams
    // Parallel streams allow for parallel processing of data, utilizing multiple threads.
    // They can significantly improve performance for large datasets by leveraging multi-core processors.
    // However, they should be used with caution, as they can introduce complexity and potential issues with thread safety.
    // It's important to ensure that operations performed on parallel streams are stateless and non-interfering.
    // Parallel streams can be created using the `parallelStream()` method on collections or by calling `parallel()` on a stream.
    // Example: Using parallel streams to process a large dataset
        int[] largeDataset = java.util.stream.IntStream.range(1, 1000000)
             .parallel()
             .filter(n -> n % 2 == 0)
             .map(n -> n * n)
             .toArray();
    System.out.println("Processed large dataset with parallel streams.");
    // Note: Always measure performance before and after using parallel streams to ensure they provide a benefit for your specific use case.
    // Parallel streams can be particularly useful for operations that are CPU-intensive or involve large datasets.
    // However, they may not be beneficial for small datasets or operations that are I/O-bound.
    // Always consider the nature of the task and the size of the dataset when deciding to use parallel streams.
    // Parallel streams can also be used with custom collectors, allowing for more complex data processing and aggregation.

       System.out.println("Parallel stream processing completed.");
        }
}
