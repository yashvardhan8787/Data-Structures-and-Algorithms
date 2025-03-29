package ArrayQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FourSum {

    public static void brute(int[] arr){
       for(int i = 0 ; i < arr.length; i++) {
           for(int j =i+1; j < arr.length ; j++){
               for(int k = j +1 ;k < arr.length ; k++){
                   for(int l = k+1; l  < arr.length ; l++){
                       if(arr[i]+arr[k]+arr[j]+arr[l] == 0 ){
                           System.out.println("["+arr[i]+","+arr[k]+","+arr[j]+","+arr[l]+"]");
                       }
                   }
               }
           }
       }

    }
    public static void better(int[] arr){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++) {
            for(int j =i+1; j < arr.length ; j++){
                for(int k = j +1 ;k < arr.length ; k++){
                    int l = arr.length - i-1;
                    if(arr[i]+arr[k]+arr[j]+arr[l] == 0 ){
                        System.out.println("["+arr[i]+","+arr[k]+","+arr[j]+","+arr[l]+"]");
                    }
                }
            }
        }
    }
    public static List<List<Integer>> fourSumOptimal(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr == null || arr.length < 4) return result;

        Arrays.sort(arr); // Sort the array for two-pointer approach

        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate elements for i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // Skip duplicate elements for j

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        while (left < right && arr[left] == arr[left + 1]) left++; // Skip duplicate elements for left
                        while (left < right && arr[right] == arr[right - 1]) right--; // Skip duplicate elements for right

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
      int[] arr={1,0,-1,0,-2,2};
//      brute(arr);
//      better(arr);
        System.out.println(fourSumOptimal(arr,0));
    }
}