package ArrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArrayWithSumK {

    public static void bruteforce(int[] arr,int  k ){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length; j++){
                int sum = 0 ;
                for(int x = i ; x <= j ; x++){
                    sum += arr[x] ;
                }
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void betterSolution(int[] arr , int k){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0 ;
            for(int j = i ; j < arr.length; j++){
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int optimalApproach(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 occurring once

        int preSum = 0, cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            int remove = preSum - k;
            cnt += map.getOrDefault(remove, 0); // Safely get count

            map.put(preSum, map.getOrDefault(preSum, 0) + 1); // Update frequency
        }

        return cnt;
    }
    public static void main(String[] args) {
       int[] arr={1,2,3,-3,1,1,1,4,2,-3};
       bruteforce(arr,3);
       betterSolution(arr,3);
       System.out.println(optimalApproach(arr,3));
    }
}
