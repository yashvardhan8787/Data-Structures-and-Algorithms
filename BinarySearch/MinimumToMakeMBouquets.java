package BinarySearch;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinimumToMakeMBouquets {

    public static boolean isPossible(int[] arr,int day,int m ,int k){
        int cnt=0;
        int noOfB=0;

        for(int i = 0;i< arr.length;i++){
            if(arr[i] <= day){
                cnt++;
            }else{
                noOfB += (cnt/k);
                cnt=0;
            }
        }
        noOfB += (cnt/k);
        return  noOfB >= m;
    }

    public static int roseGarden(int arr[], int r ,int b){
        long val = r * 1* b * 1;
        if(val > arr.length) return  -1;
        int mini=Integer.MIN_VALUE ,maxi=Integer.MAX_VALUE;
        for(int i = 0;i< arr.length;i++){
            mini = min(mini,arr[i]);
            maxi = max(maxi ,arr[i]);
        }
        int low =mini,high=maxi;
        while(low <= high){
            int mid =(low+high)/2;
            if(isPossible(arr,mid,r,b)){
                high =mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }


}
