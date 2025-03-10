package ArrayQuestions;

public class NumberAppearOnce {

    public static void bruteForce(int[] arr , int range){
        for(int i = 0 ; i < arr.length ; i++){
            int count= 0 ;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count !=2 ){
                System.out.println(arr[i]);
            }
        }
    }

    public static void betterApproach(int[] arr, int range){
       // if range would not be given then we have to first find the maximum number from array
        int[] hash= new int[range+1];
        // increment the hash values
        for (int n:arr) {
          hash[n]++;
        }
        //check for element
        for(int i = 1 ; i < hash.length; i++){
            if(hash[i] != 2){
                System.out.println(i);
            }
        }
    }

    // this is method will work only if range of array would be defined
    // only when all elements would be twice in array and u have , one element only once
    public static void goodOnlyIfRangeIsGiven(int[] arr , int range){
       int sum = 2*((range*(range +1) ) / 2 );
       int finalSum = 0 ;
       for(int i = 0 ;i < arr.length ; i++){
           finalSum = finalSum + arr[i];
       }
        System.out.println(sum - finalSum);
    }

    public static void optimalApproach(int[] arr, int range ){
        int XOR = 0 ;
        for(int i = 0 ; i < arr.length;i++){
            XOR = XOR ^ arr[i];
        }
        System.out.println(XOR);
    }
    public static void main(String[] args) {
        int[] arr={1,1,3,2,3,4,5,5,4};
        bruteForce(arr,5);
        betterApproach(arr,5);
        goodOnlyIfRangeIsGiven(arr,5);
        optimalApproach(arr,5);

    }
}
