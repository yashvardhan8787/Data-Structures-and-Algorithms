package BinarySearch;

import java.util.Arrays;

public class SplitArrayLargestSum {

    public static int sum(int arr[], int val) {
        int index = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= val) {
                sum += arr[i];
            } else {
                index++;
                sum = arr[i];
            }
        }
        return index;
    }

    public static int find(int arr[], int n, int m) {
        if (m > n) return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = sum(arr, mid);

            if (val > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(find(arr, arr.length, 2)); // Output should be 60
    }
}
