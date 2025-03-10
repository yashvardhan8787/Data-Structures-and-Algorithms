import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        System.out.println(findLongestSubarray(arr));
    }

    public static int findLongestSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If the sum equals the subarray length, update maxLen
            if (sum == i + 1) {
                maxLen = i + 1;
            }

            // If (sum - length) was seen before, update maxLen
            if (map.containsKey(sum - (i + 1))) {
                maxLen = Math.max(maxLen, i - map.get(sum - (i + 1)));
            }

            // Store the first occurrence of sum
            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }
}
