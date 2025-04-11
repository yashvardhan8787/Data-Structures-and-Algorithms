package BinarySearch;

public class SearchInRotatedArray {

    public static void brute(int arr[], int x){
        int count = 0;
        for (int i : arr) {
            count++;
            if(i ==  x){
                System.out.println(count -1 );
                break;
            }
        }

    }


    public static void Better(int arr[], int x){
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                System.out.println("Better: " + mid);
                return;
            }

            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (x > arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Better: Not found");
    }


    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        brute(arr,8);
        Better(arr,9);
    }
}
