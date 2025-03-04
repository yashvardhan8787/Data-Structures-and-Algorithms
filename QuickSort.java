public class QuickSort {


    public void  sort(int arr[], int low , int high){
        if(low < high){
            int pi=partition(arr,low,high);
            sort(arr,low,pi-1 );
            sort(arr,pi,high);
        }
    }


    public int partition(int arr[] ,int  low ,int high){
        int pivot = arr[low] ;
        int i = low ;
        //printing  pivot
        System.out.println("selecting pivot:"+ pivot +",  i="+i);


        for(int j = low ;  j <= high ; j++){
            if(arr[j] < pivot){
                System.out.println("swapping inside for");
               swap(arr,i,j );
            }
        }
        System.out.println("swapping after for");
        swap(arr,i+1,high);
        return i+1;
    }

    public void swap(int arr[], int  i , int j){
//        System.out.println("swaping "+arr[i] +" and  "+ arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }





    public void quickSortByMid(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        //    Choose a pivot element (in this case I am choosing middle element as pivot)
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        //    Initialize left and right pointers at extremes.
        int i = left, j = right;
        while (i <= j) {
            //   3. Find the first element to the left of the pivot which is greater than pivot.
            while (arr[i] < pivot) {
                i++;
            }
            //   4. Similarly find the first element to the right of the pivot which is smaller than pivot
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                //  5.  Swap elements found in 3 and 4.
                swap(arr,i ,j);
                i++;
                j--;
            }
        } // Repeat 3,4,5 unless left >= right.

        //    Repeat the whole thing for left and right subarray as pivot is now placed at its place.
        quickSortByMid(arr, left, j);
        quickSortByMid(arr, i, right);
    }

    public void quicksort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[right];
        int partitionIndex = partition2(arr, left, right, pivot);

        quicksort(arr, left, partitionIndex - 1);
        quicksort(arr, partitionIndex + 1, right);
    }

    int partition2(int[] arr, int left, int right, int pivot) {
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr={4,6,2,5,7,9,3,1};
//        System.out.print("array : [ ");
//        for (int i :arr) {

//            System.out.print(i+",");
//        }
//        System.out.println(" ]");
//        System.out.println(qs.partition(arr,0 ,7));
//
//        System.out.print("array : [ ");
//        for (int i :arr) {
//            System.out.print(i+",");
//        }
//        System.out.println(" ]");
//        qs.sort(arr,0 ,7);

//          qs.quickSortByMid(arr,0,7);
//        qs.sort(arr,0,7);
        qs.quicksort(arr,0,7);
          System.out.print("array : [ ");
                for (int i :arr) {
            System.out.print(i+",");
        }
        System.out.println(" ]");

    }
}
