package ArrayQuestions;

import java.util.Arrays;

public class FindMissingAndRepeatingNumbers {


    public static void BruteForceApproach(int arr[]){
        for(int i = 1 ; i < arr.length+1 ; i++){
            int count = 0 ;
            for(int j  = 0 ; j < arr.length ; j++){
                if(i == arr[j]){
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i +" is missing number ");
            }
            if(count > 1){
                System.out.println(i+" is repeating number ");
            }
        }
    }


    public static void BetterApproach(int[] arr){
        int[] hash = new int[arr.length+1];
        for(int i = 0 ; i < arr.length ; i++){
            hash[arr[i]]++;
        }
        for(int i = 1 ; i < hash.length ; i++){
            if(hash[i] == 0 ){
                System.out.println(" missing is "+i);
            }
            if(hash[i] > 1){
                System.out.println(i+" is repeating number ");
            }
        }
    }


    public static void OptimalApproach(int[] arr){
        int n = arr.length;
       int SN = (arr.length * (arr.length+1))/2;
       int S2N = (n * (n+1)*(2*n+1))/6;

       int s=0 ,s2 = 0;

       for(int i = 0; i < n ;i++){
           s += arr[i];
           s2 +=  arr[i] * arr[i] ;
       }
       int val1= s- SN  , val2= s2 -S2N ;
       val2= val2/val1;
       int x= (val1 + val2) / 2 ,y=x-val1;
        System.out.println(x+" "+y);
    };
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,1};
//      BruteForceApproach(arr);
//      BetterApproach(arr);
        OptimalApproach(arr);
    }
}
