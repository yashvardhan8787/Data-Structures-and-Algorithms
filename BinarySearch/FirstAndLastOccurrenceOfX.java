package BinarySearch;

public class FirstAndLastOccurrenceOfX {

    public static void BruteForce(int arr[], int x){
        int first=-1;
        int last = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                if(first == -1){
                    first = i;
                    last= i;
                }else{
                    last++;
                }

            }
        }

        System.out.println("first :"+first);
        System.out.println("last :"+last);
    }



    public static void BetterApproach(int arr[] ,int x){
        System.out.println(getLowerBound(arr,x));
        System.out.println(getUpperBound(arr,x));
    }


    public static void CoreBinarySearch(int arr[] ,int x){
       int last = -1 ;
       int first = -1;

       //for first
        {
            int low = 0 ;
            int high = arr.length -1;
            while(low <= high){
                int mid = (low+high )/2;
                if(arr[mid] >= x){
                    if (arr[mid] == x) {
                        first=mid;
                    }
                    high = mid-1;
                }else{
                    low = mid +1;
                }
            }
        }

        if(first == -1) return ;

        {
            int low = 0 ;
            int high = arr.length -1;
            while( low <= high ){
                int mid = (low + high ) / 2;
                if(arr[mid] <= x){
                    if(arr[mid] == x){
                        last=mid;
                    }
                    low = mid +1 ;
                }else{
                    high =mid -1;
                }
            }
        }



        System.out.println("first :"+first);
        System.out.println("last :"+last);


    }









    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,8,8,8,11,13};
        BruteForce(arr,8);
        BetterApproach(arr,8);
        CoreBinarySearch(arr,8);
    }

















    public static int getUpperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int getLowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
