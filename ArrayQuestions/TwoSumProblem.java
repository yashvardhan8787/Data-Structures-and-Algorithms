package ArrayQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

    public static void bruteForceApproach(int[] arr, int k ){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ;j++ ){
                int sum = arr[i] +arr[j];
                if(sum == k ){
                    System.out.println("sum of "+arr[i]+" and "+arr[j]+" is a "+k);
                    return;
                }
            }
        }

    }


    public static  void betterApproach(int[] arr, int k ){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.get(k - arr[i]) != null){
                System.out.println("sum of "+arr[i]+" and "+arr[map.get( k - arr[i])]+" is a "+k);
                return;
            }else{
                map.put(arr[i] , i);
            }
        }
        System.out.println("K is not possible ");

    }


    public static  void optimalApproach( int[] arr,int k ){
        Arrays.sort(arr);
        int left=0,right = arr.length-1;

        while(left < right){
            int sum = arr[left] +arr[right];
            if(sum == k ){
                System.out.println("sum of "+arr[left]+" and "+arr[right]+" is a "+k);
                return;
            }
            else if(sum < k ) left++;
            else right--;
        }

       return;
    }
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,7,8};
     optimalApproach(arr,14);
     bruteForceApproach(arr,14);
     betterApproach(arr,14);
    }
}
