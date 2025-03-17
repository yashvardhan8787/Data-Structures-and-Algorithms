package ArrayQuestions;

import java.util.Arrays;

public class AllLeadersProblem {
    /*
    in the problems for a given array u have to find all the leader
    leaders are the elements which have all the elements less than
    itself on right side {3,2,1} 3 ,2,1, all are leaders.
     */
    public static void bruteForce(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            boolean isLeader = true ;
            for( int j = i +1 ; j< arr.length;j++){
                if(arr[i] < arr[j ]){
                    isLeader=false;
                }
            }
            if(isLeader){
                System.out.println("this is a leader "+arr[i]);
            }
        }
    }

    public static int[] optimalApproach(int[] arr){
        int[] res = new int[arr.length];
        int current =Integer.MAX_VALUE;
        int count = 0 ;
        for(int i = 0 ; i < arr.length  ; i++){
            if(arr[i] < current ){
                current = arr[i];
                res[count] =arr[i];
                count++;
            }else{
                current = arr[i];
                res = new int[arr.length - i];
                count = 0 ;
                res[count] =arr[i];
                count++;
            }
        }
        return  res ;
    }



    public static void main(String[] args) {
        int[] arr={3,1,4,3,2,8};
        bruteForce(arr);
        System.out.println(Arrays.toString(optimalApproach(arr)));


    }
}
