package ArrayQuestions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTowArrays {

    public static Set<Integer> Union(int[] arr, int[] arr2){
        Set<Integer> union = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            union.add(arr[i]);
        }
        for(int i = 0 ; i < arr2.length ; i++){
            union.add(arr2[i]);
        }
        return  union ;
    }
//    public static int[] UnionOfArrays(int[] arr, int[] arr2){
//        int[] temp;
//
//        return  temp;
//    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int[] arr2 ={0,5,5,6,7,7,8,9};

//        Set<Integer> result = Union(arr,arr2);
//        System.out.println(result);
    }
}
