package ArrayQuestions;

public class SecondLargestElement {

    public int getSecondLargest(int arr[]){
        int largest=arr[0];
        int secondLargest = -1;
        for(int i=0; i < arr.length; i++){
            if( arr[i]>secondLargest){
                 if(arr[i] == largest ) continue;
                 if(arr[i] > largest){
                     secondLargest =largest;
                     largest  = arr[i];
                 }else{
                     secondLargest = arr[i];
                 }
            }
        }
        return secondLargest;
    }


    public int getSecondSmallest( int arr[]){
        int smallest=arr[0];
        int secondSmallest= 99999;
        for(int i=0; i < arr.length; i++){
            if( arr[i] < smallest){
                secondSmallest = smallest;
                smallest =arr[i];
            }else if( !(arr[i] < smallest) && arr[i] < secondSmallest ){
                secondSmallest=arr[i];
            }
        }
        return  secondSmallest;
    }

      public boolean checkArrayIsSorted(int arr[]){
        boolean isSorted = true;
        for(int i=0 ; i < arr.length -1 ; i++){
            if(arr[i] > arr[i +1]){
                isSorted = false ;
                break;
            }
        }
        return  isSorted;
      }

      public int[] removeDuplicatesFromSortedArray(int arr[]){
        int[] resultArr= new int[arr.length];
        int previous = 0;
        resultArr[0] = arr[previous];
        int count = 1;
        for(int i =1; i < arr.length;i++){
           if(arr[i] != arr[previous]){
               resultArr[count++] = arr[i];
               previous = i ;
           }
        }
        return  resultArr;
      }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,7,9};
        SecondLargestElement sd = new SecondLargestElement();
        System.out.println(sd.getSecondLargest(arr));
        System.out.println(sd.getSecondSmallest(arr));
        System.out.println(sd.checkArrayIsSorted(arr));
        arr = sd.removeDuplicatesFromSortedArray(arr);
        for (int i :arr
             ) {
            System.out.println(i);
        }
    }
}
