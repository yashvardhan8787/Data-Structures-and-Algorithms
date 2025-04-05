package BinarySearch;

public class BinarySearch_Recursion {

    public static int Search(int[] arr,int start ,int  end ,int  ele){
        int ptr = (start + end )/2;
        if(start > end ){
            return -1;
        }
        if(ele == arr[ptr]){
            return  ptr;
        } else if(ele < arr[ptr]){
            return  Search(arr,start, ptr-1, ele);
        } else{
            return  Search(arr,ptr + 1 , end, ele);
        }
    }
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,8,9};
        System.out.println(Search(arr,0,arr.length-1, 1));
        System.out.println(Search(arr,0,arr.length-1, 3));
        System.out.println(Search(arr,0,arr.length-1, 5));
        System.out.println(Search(arr,0,arr.length-1, 9));
        System.out.println(Search(arr,0,arr.length-1, 10));

    }
}
