package BinarySearch;

public class FindSQRT {
    public static int getSQRT(int n){
        int low=0,high=n;
        int ans = 1;
        while(low <= high){
            int mid =(low + high)/2;
            if((mid*mid)<= n){
                ans=mid;
                low=mid+1;
            }else{
                high = mid -1 ;
            }
        }
        return  ans;
    }


    public static int GetSQRT(int n){

        for(int i = 0; i < n ; i++){
            if(i*i > n ){
                return i-1;
            }
        }
        return  1;
    }
    public static void main(String[] args) {
        System.out.println(getSQRT(28));
        System.out.println(GetSQRT(28));
    }
}
