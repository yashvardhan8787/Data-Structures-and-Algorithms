package BinarySearch;

public class KokoEatingBanana {

    // Get total hours needed if eating speed is `n`
    public static int hourlyTimeForN(int n, int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] + n - 1) / n;  // same as ceil(arr[i] / n)
        }
        return sum;
    }

    // Helper to get the max banana pile size
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Binary Search for optimal speed
    public static int BinaryApproach(int MaxHours , int[] arr){
        int low = 1;
        int high = getMax(arr);
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int time = hourlyTimeForN(mid, arr);

            if (time <= MaxHours) {
                result = mid;
                high = mid - 1; // Try slower speed
            } else {
                low = mid + 1;  // Speed too slow
            }
        }
        return result;
    }

    // Simple brute-force version (optional)
    public static int linearApproach(int MaxHours , int[] arr){
        for (int i = 1; i <= getMax(arr); i++) {
            if (hourlyTimeForN(i, arr) <= MaxHours) {
                return i;
            }
        }
        return getMax(arr); // fallback
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};  // sample banana piles
        int maxHours = 18;           // Koko must finish in 8 hours

        System.out.println("Minimum Eating Speed (Binary): " + BinaryApproach(maxHours, arr));
        System.out.println("Minimum Eating Speed (Linear): " + linearApproach(maxHours, arr));
    }
}
