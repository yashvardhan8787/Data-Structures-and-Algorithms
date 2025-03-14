package ArrayQuestions;

public class MaxSubArraySum {

     //time complexity of brute force solution is O(N^3) Space Complexity = O(1)
     public static void  bruteForceApproach(int[] arr){
         int maximum=Integer.MIN_VALUE;

         for(int i = 0 ; i < arr.length ; i++){
             for(int j =i ;j < arr.length ; j++ ){
                int sum = 0 ;
                for(int k = i ; k < j ; k++){
                    sum += arr[k];
                }
                maximum= Math.max(maximum,sum);
             }
         }

         System.out.println(maximum);
     }

    // better approach has a time complexity of O(N^2) and time complexity O(1)
    public static void betterApproach(int[] arr){
        int maximum=Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0 ;
            for(int j =i ;j < arr.length ; j++ ){
                sum += arr[j];
                maximum= Math.max(maximum,sum);
            }
        }

        System.out.println(maximum);

    }



    // optimal approach has a time complexity of O(N) and time complexity O(1)

    public static void optimalApproach(int[] arr){
         int max = Integer.MIN_VALUE;
         int start = -1,end = -1 ,sum =0;
         for(int i = 0 ; i < arr.length ; i++){
             if(sum == 0) start= i;
             sum += arr[i];
             if(sum > max){
                 max=sum;
                 end=i;
             }
             if(sum < 0 ){
                 sum = 0;
             }
         }


        System.out.println(start+" "+end+" "+max);


    }

    public static void main(String[] args) {
         int[] arr={-2,-3,4,-1,-2,1,5,-3};
         bruteForceApproach(arr);
         betterApproach(arr);
         optimalApproach(arr);

    }
}
