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
        System.out.println("swaping "+arr[i] +" and  "+ arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        qs.sort(arr,0 ,7);
        System.out.print("array : [ ");
        for (int i :arr) {
            System.out.print(i+",");
        }
        System.out.println(" ]");

    }
}
