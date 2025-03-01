class SortingAlgorithms{

    public void bubbleSort(int arr[]){            //  worst && avg case    //O(N^2)
        for(int i =0; i < arr.length;i++){
            int swapCount=0;                        // best case O(N)
            for(int j =0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){              // it is optimized
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                    swapCount=1;
                }
            }
            if(swapCount ==0){
                break;
            }
        }
    }


    public void selectionSort(int arr[]){  //    best && worst && avg case     //O(N^2)
        for(int i =0; i < arr.length;i++){
            int min= i;
            for(int j =i; j < arr.length;j++){
               if(arr[min] > arr[j]){
                   min=j;
               }
            }
            int temp = arr[min];
            arr[min] =arr[i];
            arr[i] =temp;
        }
    }


    public void insertionSort(int arr[]){
        for(int i=1; i < arr.length;i++){
            for(int j =i; j >0 ;j--){
                if(arr[j] < arr[j-1]){   //worst && avg and best in this case in O(N^2)
                    int temp = arr[j];   // but it can be optimized further
                    arr[j] =arr[j-1];
                    arr[j-1] =temp;
                }
            }
        }
    }



    public static void main(String[] args) {

        int arr[]={9,8,7,6,5,4,3,2,1} ;   //array
        int arr2[]={9,8,7,6,5,4,3,2,1} ;   //array
        int arr3[]={9,8,7,6,5,4,3,2,1} ;   //array
        SortingAlgorithms s=new SortingAlgorithms();
        //bubble sort
        s.bubbleSort(arr);
        for (int i :arr) {
            System.out.print( " ,"+ i);
        }

        //selection sort
        s.selectionSort(arr2);
        System.out.println(" ");
        for (int i :arr2) {
            System.out.print( " ,"+ i);
        }


        //insertion sort
        s.insertionSort(arr3);
        System.out.println(" ");
        for (int i :arr2) {
            System.out.print( " ,"+ i);
        }
    }
}
