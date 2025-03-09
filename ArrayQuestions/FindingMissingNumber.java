package ArrayQuestions;
public class FindingMissingNumber {

    //brute force solution
    public static void missingNumber(int[] arr, int N){
        for (int i = 1 ; i < N ; i++ ){
            boolean isPresent =false;
            for(int j = 0 ;  j < N-1 ; j ++){
                if( i ==arr[j]){
                   isPresent= true ;
                }
            }
            if(!isPresent){
                System.out.println(i);
            }
        }
    }

    //better solution using hash
    public static void missingNumberHash(int[] arr,int N ){
        int[] hash= new int[N+1];
        for(int i = 0 ; i < arr.length ; i++){
            hash[arr[i]]=1;
        }
        for(int i =0; i < N ; i++){
            if(hash[i] != 1){
                System.out.println(i);
            }
        }
    };

    public static void optimalSolution(int[] arr,int N ){
        int sum = (N*(N+1))/2;
        int sum2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum2 = sum2 + arr[i];
        }
        System.out.println( sum - sum2 );
    }

    public static void bestSolution(int[] arr , int N) {
        int xor1 = 0 , xor2 = 0 ;
        int n=N-1;

        for(int i = 0 ; i < n ;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ N ;
        System.out.println(xor1 ^ xor2);
    }


    public static void main(String[] args) {
      int[] arr={1,3,2,5};
//      bestSolution(arr,5);
//      missingNumber(arr,5);
//      missingNumberHash(arr,5);
        optimalSolution(arr,5);

    }
}
