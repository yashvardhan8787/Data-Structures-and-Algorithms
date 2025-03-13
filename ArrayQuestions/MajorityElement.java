package ArrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //time complexity of this function is O(N2)
    // and space complexity near about O(1)
    public static void bruteForceApproach(int[] arr){
        int majorityElementIndex= -1;
        int countOfMajorityElement = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int count  = 0 ;
            for(int j= 0 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                   count++;
                }
            }
            if(count > countOfMajorityElement){
                majorityElementIndex = i;
                countOfMajorityElement=count;
            }
        }
        System.out.println(arr[majorityElementIndex]);
    }



    // time complexity of a function is a O(N)
    // space complexity of a function is a O(N)
    public static void betterApproachUsingHashing(int[] arr){
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
           if(hash.get(arr[i])!= null){
              hash.put(arr[i] ,hash.get(arr[i]) + 1) ;
           }else{
               hash.put(arr[i],1);
           }
        }

        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }


    //the optimal approach
    public static void MorseVotingAlgorithm(int[] arr){
        int cnt= 0 ;
        int el= -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(cnt == 0 ){
                cnt =1;
                el=arr[i];
            }else if(arr[i] == el){
               cnt++;
            }else{
                cnt-- ;
            }
        }

        int cnt1 = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]== el){
                cnt1++;
            }
        }
        if(cnt1 > arr.length-1 /2 ){
            System.out.println(el);
        }else{
            System.out.println(el);
        };
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
   //     bruteForceApproach(arr);
   //     betterApproachUsingHashing(arr);
        MorseVotingAlgorithm(arr);
    }
}
