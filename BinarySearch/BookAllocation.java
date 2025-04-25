package BinarySearch;

import java.util.Arrays;

public class BookAllocation {

    public static int count(int arr[] , int pages){
        int students = 1;
        int pagesStudent = 0;
        for(int i = 0;i< arr.length;i++){
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            }else{
                students += 1;
                pagesStudent = arr[i];
            }
        }
        return students;
    }


    public static int find(int arr[], int n, int m){
        Arrays.sort(arr);
        if(m > n )return -1;
        int low = arr[0],  high =arr[arr.length-1];
        while(low <= high){
            int mid = (low+high )/2;
            int students = count(arr,mid);
            if(students > m){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return  low;
    }
}
