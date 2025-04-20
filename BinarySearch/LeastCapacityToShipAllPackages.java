package BinarySearch;

public class LeastCapacityToShipAllPackages {

    // Returns how many days are needed to ship all packages under a given weight limit
    public static int requiredDays(int[] arr, int limit) {
        int daysRequired = 1;
        int currentWeight = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limit) {
                // Can't be shipped under this limit
                return Integer.MAX_VALUE;
            }

            if (currentWeight + arr[i] <= limit) {
                currentWeight += arr[i];
            } else {
                daysRequired++;
                currentWeight = arr[i];
            }
        }

        return daysRequired;
    }

    //  Linear search from max(arr) to sum(arr)
    public static int LinearApproach(int[] arr, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int val : arr) {
            sum += val;
            max = Math.max(max, val);
        }

        for (int capacity = max; capacity <= sum; capacity++) {
            if (requiredDays(arr, capacity) <= days) {
                return capacity;
            }
        }

        return -1;
    }

    // Binary Search to find the least possible capacity
    public static int BinaryApproach(int[] arr, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int val : arr) {
            sum += val;
            max = Math.max(max, val);
        }

        int low = max;
        int high = sum;
        int result = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (requiredDays(arr, mid) <= days) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 4;

        System.out.println("Linear Approach Result: " + LinearApproach(weights, days));
        System.out.println("Binary Approach Result: " + BinaryApproach(weights, days));
    }
}
