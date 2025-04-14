package BinarySearch;
import java.util.HashMap;
import java.util.Map;

public class FindInSingleElementInSortedArray {
     public static void linearApproach(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0 ){
                if(arr[i] != arr[i+1]){
                    System.out.println(arr[i]);
                    return;
                }
            }else if( i == arr.length-1){
                if(arr[i] != arr[i-1]){
                    System.out.println(arr[i]);
                    return;
                }
            }else{
                if(arr[i] != arr[i+1] && arr[i] != arr[i-1] ) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
     }


     public static void usingHashMap(int arr[]){
         Map<Integer,Integer> map= new HashMap<>();
         for(int i = 0 ; i < arr.length ; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }

         for (int i:map.keySet()){
             if(map.get(i) == 1){
                 System.out.println(i);
                 return;
             }
         }
     }

     public static void BinarySearchApproach (int arr[]){
//         int low = 0 ,high = arr.length -1 ;
//         while(low <= high){
//             int i=(low+high)/2;
//             if(i == 0 ){
//                 if(arr[i] != arr[i+1]){
//                     System.out.println(arr[i]);
//                     return;
//                 }
//             }else if( i == arr.length-1){
//                 if(arr[i] != arr[i-1]){
//                     System.out.println(arr[i]);
//                     return;
//                 }
//             }else{
//                 if(arr[i] != arr[i+1] && arr[i] != arr[i-1] ) {
//                     System.out.println(arr[i]);
//                     return;
//                 }
//             }
//
//             if(arr[i] == arr[i+1] && i%2 ==0){
//                  low=i+1;
//              }else{
//                  high=i-1;
//             }
//
//         }

         //gpt version
         int low = 0, high = arr.length - 1;

         while (low < high) {
             int mid = low + (high - low) / 2;

             // Ensure mid is even
             if (mid % 2 == 1) {
                 mid--;
             }

             if (arr[mid] == arr[mid + 1]) {
                 // Unique element is after this pair
                 low = mid + 2;
             } else {
                 // Unique element is before or at mid
                 high = mid;
             }
         }

         System.out.println(arr[low]);
     }
    public static void main(String[] args) {
         int[] arr = {1,1,2,2,3,4,4,5,5};
     linearApproach(arr);
     usingHashMap(arr);
     BinarySearchApproach(arr);
    }
}
