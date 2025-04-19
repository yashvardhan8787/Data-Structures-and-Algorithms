package BinarySearch;

public class SmallestDivisor {


    public static int Ceil(int x , int y){
        if(x % y == 0 ){
           return  x / y ;
        }else{
            return  x/y + 1;
        }
    }
    public static int sumByD(int[] arr, int div){
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            sum =  sum + Ceil(arr[i],div);
        }
        return  sum;
    }
    public static int smallestDivisor(int[] arr,int threshold){
     int low = 1 , high = arr[arr.length-1];
     while(low <= high){
         int mid =(low + high)/2;
         if(sumByD(arr,mid) <= threshold){
            high = mid -1 ;
         }else{
             low = mid +1;
         }

     }
     return low;
    }
    public static void main(String[] args) {
     int[] arr={1,2,3,5,9};
        System.out.println(smallestDivisor(arr,6));

    }
}
