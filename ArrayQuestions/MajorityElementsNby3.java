package ArrayQuestions;

import java.util.*;

public class MajorityElementsNby3 {
    public static void bruteForceApproach(int[] arr){
        //Using set data structure
        Set<Integer> majorityEle= new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > ( arr.length/3)){
                //Enter that element to the set
                majorityEle.add(arr[i]);
            }
        }
        System.out.println(majorityEle);
    }

    public static void betterApproach(int[] arr){
        Arrays.sort(arr);  //instead of using hashing using array can also use hashMap
        int[] hash= new int[(arr[arr.length-1])+1];
        for (int i : arr) {
            hash[i]++ ;
        }
        for(int i = 0 ; i < hash.length ; i++){
            if(hash[i] > 2){
                System.out.print(i+" ");
            }
        }
    }


    public static void optimalApproach(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i ++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int val: map.keySet()){
            if(map.get(val) > 2){
                System.out.println(val);
            }
        }
        System.out.println(map);
    };

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3};
//        bruteForceApproach(arr);
//        betterApproach(arr);
        optimalApproach(arr);
    }
}
