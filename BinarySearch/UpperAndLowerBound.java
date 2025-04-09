package  BinarySearch ;

public class UpperAndLowerBound {

    public static int getUpperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int getLowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9};

        int target = 7;
        int upper = getUpperBound(arr, target);
        int lower = getLowerBound(arr, target);

        System.out.println("Lower Bound of " + target + " is at index: " + lower);
        System.out.println("Upper Bound of " + target + " is at index: " + upper);
    }
}
