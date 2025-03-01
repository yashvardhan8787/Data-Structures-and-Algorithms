public class MergeSort {
    public void mergeSort(int[] arr, int low , int high){
        if(low == high) return;
        int mid = (low + high )/2;
        mergeSort( arr, low ,  mid);
        mergeSort(arr, mid + 1,high);
        merge(arr,low,mid,high);
    }

    public void merge(int[] arr, int low , int mid , int high){
        int[] temp =new int[ low + high + 1];

        int left = low;
        int right = mid+1;
        int count =0;
        while(left <= mid && right <= high){
            if(arr[left] > arr[right]){
               temp[count]=arr[right] ;
               count++;
               right++;
            }else{
                temp[count]=arr[left] ;
                count++;
                left++;
            }
        }
        while(left <= mid){
            temp[count]=arr[left] ;
            count++;
            left++;
        }
        while(right <= high){
            temp[count]=arr[right] ;
            count++;
            right++;
        }
        int count2=0;
        for(int i = low ; i <= high ; i++){
            arr[i] = temp[count2++];
        }
    }

    public static void main(String[] args) {
        // Divide into half until it has only single element
        // and them merge it in sorted order
        //array
        int[] arr = {3,1,2,4,1,5,2,6,4};
        MergeSort ms=new MergeSort();
        ms.mergeSort(arr,0,8);
        for (int i :arr) {
            System.out.println(i);

        }
    }
}
