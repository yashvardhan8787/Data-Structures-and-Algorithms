package ArrayQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge2SortedArraysWithoutExtraSpace {

    public static void merge(int[] arr1,int[] arr2){
      int[] arr3 = new int[arr1.length + arr2.length ];
      int m = 0 ;
      int n = 0 ;
      int count = 0 ;
      while (m < arr1.length && n < arr2.length ){
          if(arr1[m] < arr2[n]){
            arr3[count] = arr1[m];
            count++;
            m++;
          }else{
              arr3[count] = arr2[n];
              count++;
              n++;
          }
      }

      while(m < arr1.length ){
          arr3[count] = arr1[m];
          count++;
          m++;
      }
      while( n < arr2.length){
          arr3[count] = arr2[n];
          count++;
          n++;
      }


        System.out.println(Arrays.toString(arr3));
    }



    public static void betterMerge(int[] arr1,int[] arr2){
        int m = arr1.length-1 ;
        int n = 0 ;
        int count = 0 ;
        while (m < arr1.length && n < arr2.length ){
            if(arr1[m] > arr2[n]){
               int temp = arr1[m];
                arr1[m] = arr2[n];
                arr2[n]=temp;
                m--; n++;

            }else{
              break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void swap(int[] arr1 , int[] arr2,int ind1 , int ind2){
        if(arr1[ind1] > arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2]=temp;
        }
    }

    public static void GapMerge(int[] arr1 , int[] arr2,int n , int m){
        int len =(n+m);
        int gap=(len/2)+(len%2);
        while( gap > 0 ) {
            int left = 0;
            int right = left+gap;
            while(right < len){
                if(left < n && right >= n ){
                    swap(arr1,arr2,left,right-n);
                } else if (left >= n) {
                    swap(arr1,arr2,left -n ,right-n);
                }else{
                    swap(arr1,arr2,left,right);
                }
                left++;
                right++;
            }
            if(gap == 1 ) break;
            gap= (gap/2) +(gap%2);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        int[] arr1 ={1,3,5,7};
        int[] arr2 = {0,2,6,8,9};

        merge(arr1,arr2);
        betterMerge(arr1,arr2);
        GapMerge(arr1,arr2,4,5);
    }

}
