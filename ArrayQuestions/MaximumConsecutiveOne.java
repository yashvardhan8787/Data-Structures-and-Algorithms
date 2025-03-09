package ArrayQuestions;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,1,1,1,0,0,1,0,1,1,1,1};
        int finalCount = 0 ;
        int count=0 ;
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] != 1 || i == arr.length-1){
                if(count > finalCount){
                    finalCount = count ;
                    count = 0 ;
                }
            }else{
                count++;
            }
        }
        System.out.println(finalCount);
    }
}
