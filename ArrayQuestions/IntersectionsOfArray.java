package ArrayQuestions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntersectionsOfArray {
    public static  void  Intersection(int[] arr, int[] arr2){
        Set<Integer> result = new HashSet<>();
        for(int i = 0 ; i <arr.length ; i++) {      // time complexity of Intersection O(n*M)
            for (int j = 0; j < arr2.length; j++){
                if (arr[i] == arr2[j]) {
                    result.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static void IntersectionSecond(int arr[],int arr2[]){
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();             //time complexity O(n+m)
        for(int num: arr){
            set.add(num);
        }

        for(int n : arr2){
            if (set.contains(n)) {
                result.add(n);
            }
        }

        System.out.println(result);

    }

    public static int[] bestIntersection(int[] arr, int[] arr2){
        int[] result = new int[arr.length];
        int[] auxilary = new int [arr.length];
        int  count = 0 ;
        for(int i = 0 ; i < arr2.length ; i++){                         //time complexityO(M*n)
            for(int j = 0 ; j< arr.length; j++ ){
               if(arr[j] == arr2[i] && auxilary[j] == 0){
                   auxilary[j] = 1 ;
                   result[count++]= arr[j];
               }
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int[] arr2 ={0,5,5,6,7,7,8,9};
        Intersection(arr,arr2);
        IntersectionSecond(arr,arr2);
        for (int num :bestIntersection(arr,arr2)) {
            System.out.println(num);
        }
    }
}
