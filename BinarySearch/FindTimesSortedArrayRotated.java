package BinarySearch;

public class FindTimesSortedArrayRotated {

    public static void LinearApproach(int arr[]){
        int count= 0;

        for(int i = 0 ; i < arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
               count = i+1;
               break;
            }
        }

        System.out.println(count);

    }

    public static void BinarySearchApproach(int[] arr){
        int low=0,high= arr.length -1;
        int RotateCount= 0;
        while(low <= high){
            int mid=(low +high)/2;

            if(mid != arr.length-1) {
                if (arr[mid] > arr[mid + 1]) {
                    RotateCount=mid +1 ;
                    break;
                }
            }
            if( arr[mid] < arr[high] && arr[mid] > arr[low] ){
                low = mid +1;
            }else{
                high =mid -1;
            }
        }

        System.out.println(RotateCount);

    }

    public static void main(String[] args) {
        int arr[]={5,6,7,1,2,3,4};
        LinearApproach(arr);
        BinarySearchApproach(arr);
    }
}
