package BinarySearch;

public class NoOfOccurrenceOfX {
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

        System.out.println("number of occurrence :"+ (last - first));

    }


    public static void BestApproach(int[] arr, int x){
        int first= -1;
        int last = -1;

        {
            int high = arr.length -1 ;
            int low = 0 ;
            while(low <= high ){
                int mid = (low + high )/ 2 ;
                if(arr[mid] >= x){
                    if(arr[mid] == x){
                        first = mid;
                    }
                    high = mid - 1;
                }else{
                    low = mid +1 ;
                }
            }
        }


        if(first == -1){
            System.out.println("Occurrence "+0);
            return;
        }


        {
            int high = arr.length -1 ;
            int low = 0 ;
            while(low <= high ){
                int mid = (low + high )/ 2 ;
                if(arr[mid] <= x){
                    if(arr[mid] == x){
                        last = mid;
                    }
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }



        System.out.println("Occurrence "+(last - first));
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,8,8,8,11,13};
        BruteForce(arr,8);
        BestApproach(arr,8);

    }
}
