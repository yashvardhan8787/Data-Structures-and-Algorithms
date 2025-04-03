package ArrayQuestions;

public class MaximumProductSubArray {
    // find a sub array with  the highest product
    public static void Brute(int[] arr){
        int n = arr.length ;
        int start = 0;
        int end = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int  j = i ; j < n ; j++){
                int product = 0 ;
                for(int k = i ; k <= j ; k++){
                    if(k == i ){
                        product = arr[k];
                    }else{
                        product *=  arr[k];
                    }
                }
                if (product > max) {
                    start = i ;
                    end = j;
                    max = product ;
                }
            }
        }
        System.out.println(max+" "+start+" "+ end +" ");
    }



    public static void Better(int[] arr){
        int n = arr.length ;
        int start = 0;
        int end = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int product = 0 ;
            for(int  j = i ; j < n ; j++){
                if(j == i ){
                    product = arr[j];
                }else{
                    product *=  arr[j];
                }
                if (product > max) {
                    start = i ;
                    end = j;
                    max = product ;
                }
            }

        }
        System.out.println(max+" "+start+" "+ end +" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Brute(arr);
        Better(arr);
    }
}
