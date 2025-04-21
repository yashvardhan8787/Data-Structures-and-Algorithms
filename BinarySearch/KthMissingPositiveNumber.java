package BinarySearch;

public class KthMissingPositiveNumber {
    public static int LinearApproach(int arr[] , int k ){
        int MissingCount= 0 ;
        int pointer = 0;
        for(int i = 1 ; i < arr[arr.length -1] ; i++){
            if(arr[pointer] > i && arr[pointer] != i){
                MissingCount++;
            }else{
                pointer++;
            }

            if(MissingCount == k){
                return i;
            }
        }
        return  -1;
    };

    public static int BinaryApproach(int arr[], int k ){
        int low = 0 ; int  high = arr.length;
        while(low <= high ){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);

            if(missing < k){
              low = mid +1;
            }else{
              high = mid -1 ;
            }
        }
        return  low + k ;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,11};
        System.out.println(LinearApproach(arr,5));
        System.out.println(BinaryApproach(arr,5));

    }
}
