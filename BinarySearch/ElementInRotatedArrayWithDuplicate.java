package BinarySearch;

public class ElementInRotatedArrayWithDuplicate {

    public static void Method(int arr[] , int x){
        int low = 0  , high  = arr.length -1 ;
        while(low <= high ){
            int mid = (low + high)/2;
            if( arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low+1;
                high = high-1;
                continue;
            }

            if(arr[mid] == x){
                System.out.println("found at "+mid);
                break;
            }

            if(arr[low] < arr[mid]){
                if(x>= arr[low] && x < arr[mid]){
                    high = mid -1;
                }else{
                    low = mid +1;
                }
            }else{
                if(x > arr[mid] && x < arr[high]){
                    low = mid +1;
                }else{
                    high = mid -1;
                }

            }

        }

    }

    public static void main(String[] args) {
        int arr[] = {6,6,7,8,1,2,3,4,5,6,6,6};
        Method(arr,8);
    }






}
