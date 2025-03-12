package ArrayQuestions;

import java.util.Arrays;
class DutchNationalFlagAlgorithm {
    // this Algorithm is  used to sort array using 3 pointers
    // the problem is to sort Array containing only 1,0 and 2
    // the brute force approach is to sort it using any sorting algorithm
    // which will have time complexity of 0(n log n )

    public static void betterApproach(int[] arr){
        int count0=0;
        int count1=0;     //time complexity of O(2N)
        int count2=0;

        for (int n :arr) {
            if(n == 0){
               count0++;
            } else if (n==1 ) {
                count1++;
            }else{
               count2++;
            }
        }

        for(int i = 0 ; i < count0; i++){
            arr[i]=0;
        }
        for(int i = count1-1 ; i < count0+count1; i++){
            arr[i]=1;
        }
        for(int i =count0+count1-1 ; i < count0 + count1 +count2; i++){
            arr[i]=2;
        }

        System.out.println(Arrays.toString(arr));
    }


    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void optimalApproach(int arr[]){
        // here we will use DutchNationalFlagAlgorithm and we will use three pointers
        int low=0,mid=0 ,high=arr.length-1;

        while(mid <= high){           //Time Complexity of O(N)
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
               swap(arr,mid,high);
               high--;
            }
        }


        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] array ={1,1,0,1,2,0,1,2,0,0,2,1,2,1,0,1,1};
  //      betterApproach(array);
          optimalApproach(array);

    }
}
