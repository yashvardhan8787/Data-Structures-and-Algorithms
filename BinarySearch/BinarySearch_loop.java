package BinarySearch;

public class BinarySearch_loop {
    public static void Search(int[] arr , int ele){
        int start = 0;
        int end  = arr.length-1 ;
        int ptr = (start + end )/2;

        while( ptr >= start && ptr <= end ){
            if(ele == arr[ptr]){
                System.out.println("element: "+ele+" position: "+ptr);
                break ;
            }else if(ele > arr[ptr]){
                start = ptr + 1 ;
            }else{
                end = ptr - 1 ;
            }
            ptr = (start + end )/2;
        }
    }
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,8,9};
        Search(arr,5);
    }
}
