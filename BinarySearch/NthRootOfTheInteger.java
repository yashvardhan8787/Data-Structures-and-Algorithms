package BinarySearch;

public class NthRootOfTheInteger {
    public static int power(int base, int exponent) {
        int res = 1;
        for (int i = 0; i < exponent; i++) {
            res *= base;
        }
        return res;
    }




    public static void linearMethod(int  n , int m){
         for (int i = 1 ; i<= m ; i++){
             int root = power(i,n);
             if(root >= m){
                 if(root==m){
                     System.out.println(i);
                 }else{
                     System.out.println("no root ");
                 }
                 break;
             }
         }
    }




    public static void BinaryApproach(int n , int m){
        int low=0 , high = m;
        while(low <= high){
            int mid= (low+high)/2 ;
            int midRoot=power(mid,n);
            if(midRoot== m){
                System.out.println(mid);
                return;
            }else if(midRoot < m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    }
    public static void main(String[] args) {
     linearMethod(4,81);
     BinaryApproach(4,81);


    }
}
