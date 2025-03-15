package ArrayQuestions;

import java.util.Arrays;
import java.util.Arrays;

class SortedPermutations {

    public static void allPermutation(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        do {
            System.out.println(Arrays.toString(arr));
        } while (nextPermutation(arr)); // Step 2: Generate next lexicographical permutation
    }

    // Function to get the next lexicographical permutation
    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 2;

        // Find the rightmost element smaller than its next element
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no such element is found, we are at the last permutation
        if (i < 0) return false;

        // Find the rightmost element larger than arr[i]
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap arr[i] and arr[j]
        swap(arr, i, j);

        // Reverse the suffix starting from i+1
        reverse(arr, i + 1, arr.length - 1);
        return true;
    }

    // Swap helper function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse helper function
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}


public class NextPermutation extends SortedPermutations {

    public static int  permutation( int n ){
        if(n == 1 ){
            return  1 ;
        }
        return n * permutation(n-1);
    }

//    public static void  allPermutation( int[] arr){
//        for(int i = 0 ; i < permutation(arr.length) ; i++){
//            swap( arr ,i % (arr.length ) ,(i+1 )% (arr.length ) );
//            System.out.println(Arrays.toString(arr));
//        }
//
//    }

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
