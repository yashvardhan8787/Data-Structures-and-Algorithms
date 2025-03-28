package ArrayQuestions;

import java.util.*;

public class ThreeSum {



    public static void bruteForce(int[] arr){
        Arrays.sort(arr);
        Set<List<Integer>> unique = new HashSet<>();
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = i+1 ; j< arr.length ; j++){
                for(int k = j +1 ; k < arr.length ; k++){
                    if(arr[i] + arr[j]+ arr[k]== 0){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(arr[i]);
                        sum.add(arr[j]);
                        sum.add(arr[k]);
                        unique.add(sum);
                    }
                }
            }
        }

        System.out.println(unique);

    }


    public static void better(int[] arr){
        Arrays.sort(arr);
        Set<List<Integer>> unique = new HashSet<>();
        for(int i = 0 ; i< arr.length -2; i++){
                    if(arr[i] + arr[i+1]+ arr[i+2]== 0){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(arr[i]);
                        sum.add(arr[i+1]);
                        sum.add(arr[i+2]);
                        unique.add(sum);
                    }
        }
        System.out.println(unique);
    }


    public static void optimal(int[] arr){
        Arrays.sort(arr);
        Set<List<Integer>> unique = new HashSet<>();
        for(int i = 0 ; i< arr.length ; i++){
            if(i > 0  && arr[i] == arr[i-1]) continue;
            int j = i +1 , k = arr.length-1;

            while ( j < k ){
                int s = arr[i] + arr[j] + arr[k] ;
                if(s < 0 ){
                     j++;
                } else if (s > 0) {
                     k--;
                }else{
                    List<Integer> sum = new ArrayList<>();
                    sum.add(arr[i]);
                    sum.add(arr[j]);
                    sum.add(arr[k]);
                    unique.add(sum);

                    j++;
                    k--;
                    while(j < k && arr[i] == arr[j-1])j++;
                    while(j < k && arr[k] == arr[k+1])k--;

                }
            }
        }
        System.out.println(unique);
    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        bruteForce(arr);
        better(arr);
        optimal(arr);


    }
}
