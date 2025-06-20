package JavaStreams;

public class IntermediateOps {
    public static void main(String[] args) {

        // Example of using intermediate operations in Java Streams
        // This is a placeholder for your stream operations
        // You can use operations like filter, map, sorted, etc.

        // Example: Filtering even numbers from an array
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Using streams to filter even numbers
        int[] evenNumbers = java.util.Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        // Print the even numbers
        System.out.println("Even Numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        // function map example
        System.out.println("\nSquared Numbers: ");
        int[] squaredNumbers = java.util.Arrays.stream(numbers)
                .map(n -> n * n)
                .toArray();
        for (int num : squaredNumbers) {
            System.out.print(num + " ");
        }


        //sorted
        System.out.println("\nSorted Numbers: ");
        int[] sortedNumbers = java.util.Arrays.stream(numbers)
                .sorted()
                .toArray();
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }


        //distinct

        System.out.println("\nDistinct Numbers: ");
        int[] distinctNumbers = java.util.Arrays.stream(new int[]{1, 2, 2, 3, 4, 4, 5})
                .distinct()
                .toArray();
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }


        //limit
        System.out.println("\nLimited Numbers: ");
        int[] limitedNumbers = java.util.Arrays.stream(numbers)
                .limit(3) // Limit to first 3 elements
                .toArray();
        for (int num : limitedNumbers) {
            System.out.print(num + " ");
        }

        //skip

        System.out.println("\nSkipped Numbers: ");
        int[] skippedNumbers = java.util.Arrays.stream(numbers)
                .skip(2) // Skip first 2 elements
                .toArray();
        for (int num : skippedNumbers) {
            System.out.print(num + " ");
        }

    }
}
