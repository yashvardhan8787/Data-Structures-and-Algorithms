package ArrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithXOR_K {


    public static  void brute(int[] arr , int  k ){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int xor = 0;
                for(int l = i ; l <=j; l++){
                    xor= xor ^ arr[l];
                }
                if(xor == k ){
                  count++;
                }
            }
        }
        System.out.println(count);
    }

    public static  void better(int[] arr , int  k ){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int xor = 0;
            for(int j = i ; j < arr.length ; j++){
                xor=xor^ arr[j];
                if(xor == k ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    public static void optimal(int[] arr, int k) {
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];

            // If XOR from start till now is equal to k, increase count
            if (xr == k) {
                cnt++;
            }

            // Check if (xr ^ k) exists in the map
            int x = xr ^ k;
            cnt += map.getOrDefault(x, 0);

            // Store the current XOR in the map
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        System.out.println(cnt);
    }



    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        brute(arr,6);
        better(arr,6);
        optimal(arr,6);
    }
}
