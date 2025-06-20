package JavaStreams;

public class terminalOps {
    public static void main(String[] args) {
        // Example usage of terminal operations in Java Streams

        // 1. Collecting elements into a list
        var numbers = java.util.stream.Stream.of(1, 2, 3, 4, 5)
                .collect(java.util.stream.Collectors.toList());
        System.out.println("Collected List: " + numbers);

        // 2. Finding the maximum element
        var max = java.util.stream.Stream.of(1, 2, 3, 4, 5)
                .max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max Value: " + value));

        // 3. Counting elements
        long count = java.util.stream.Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("Count: " + count);

        // 4. Reducing elements to a single value
        int sum = java.util.stream.Stream.of(1, 2, 3, 4, 5)
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
