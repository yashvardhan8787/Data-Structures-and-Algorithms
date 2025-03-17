package ArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {


    public static int  longestSequence(int[] arr){
        Arrays.sort(arr);
        if(arr.length  == 0) return 0 ;
        int largest  = 0 ;
        int count = 1;

        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i + 1] == arr[i] + 1){
                count++;
            }else{
               largest = Integer.max(largest ,count);
               count = 1 ;
            }
        }
        largest = Integer.max(largest ,count);
        return  largest ;
    }
    public static int  optimalLongestSequence(int[] arr){
        if(arr.length  == 0) return 0 ;
        int largest  = 1 ;
        Set<Integer> set = new HashSet<>() ;
        for(int i = 0 ; i < arr.length - 1; i++){
             set.add(arr[i]);
        }
        for (Integer st :set) {
            if(set.contains(st -1 )){
                int cnt  = 1 ;int x  = st;
                while(set.contains(x +1 )){
                    x = x+1;
                    cnt = cnt +1;
                }
                largest = Integer.max(largest,cnt);
            }

        }

        return  largest ;
    }


    public static void main(String[] args) {
        int[] arr={102,4,100,1,101,3,2,1,1};
        System.out.println(longestSequence(arr));
        System.out.println(optimalLongestSequence(arr));
    }
}
