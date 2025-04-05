package ArrayQuestions;

import java.util.HashMap;

public class LongestSubArray {
    public static int length_Of_Largest_SubArray_With_Sum_K(int arr[],int kk) {
        int n = arr.length;
        int Elements = 0;
        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum == kk) {
                    if ((j - i) > Elements) {
                        Elements = (j - i) + 1;
                    }
                }
            }
        }
        return Elements;
    }
    public static int betterThenBruteFore(int arr[], int k) {
        int n = arr.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static int optimizedApproach(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            map.putIfAbsent(sum, i);
        }
        return maxLength;
    }


        public static void main (String[]args){
            int[] arr = {1, 2, 3, 4,1,1,1,1, 5, 6};
            System.out.println(length_Of_Largest_SubArray_With_Sum_K(arr,4));
            System.out.println(betterThenBruteFore(arr,6));
            System.out.println(optimizedApproach(arr,8));;
    }
}
