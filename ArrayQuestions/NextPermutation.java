package ArrayQuestions;

import java.util.Arrays;

public class NextPermutation {

    public static int  permutation( int n ){
        if(n == 1 ){
            return  1 ;
        }
        return n * permutation(n-1);
    }

    public static void  allPermutation( int[] arr){
        for(int i = 0 ; i < permutation(arr.length) ; i++){
            swap( arr ,i % (arr.length ) ,(i+1 )% (arr.length ) );
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void swap(int[] arr , int i ,int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println(permutation(3));
        int[] arr={1,2,3};
        allPermutation(arr);
    }
}
