package BinarySearch;

public class MinimumInRotatedArray {
    public static void useLinear(int[] arr){
        int min= Integer.MAX_VALUE;

        for (int i :arr) {
            if(i < min){
                min=i;
            }
        }

        System.out.println("Minimum is "+min);
    }

    public static void useBinarySearch(int[] arr){
        int min = Integer.MAX_VALUE;
        int low= 0  , high = arr.length -1;
        while(low <= high ){
            int mid = (low + high)/2;

            if(arr[mid] < min){
                min=arr[mid];
            }

            if( arr[mid] < arr[high]){
               high = mid;
            }else if(arr[mid]> arr[high]){
               low=mid+1;
            }else{
                high -- ;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = {6,6,7,8,1,2,3,4,5,6,6,6};
        useLinear(arr);
        useBinarySearch(arr);

    }
}
