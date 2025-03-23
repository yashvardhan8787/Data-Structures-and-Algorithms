package ArrayQuestions;

import java.util.Arrays;

public class SetMatrixZeros {
   /*find the zero in the matrix
   of 0  and 1
    */

    public static void makeRowZero(int[][] arr, int i){
        for(int x= 0 ; x < arr.length; x++){
            if(arr[i][x] != 0){
                arr[i][x] = -1;
            }
        }
    }
    public static void makeColZero(int[][] arr,int j){
        for(int x= 0 ; x < arr.length; x++){
            if(arr[x][j] != 0){
                arr[x][j] = -1;
            }
        }
    }
    public static void brute(int[][] arr){
        for (int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j< arr.length;j++){
                if(arr[i][j]== 0){
                    makeRowZero(arr,i);
                    makeColZero(arr ,j);
                }
            }
        }

        for (int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j< arr.length;j++){
                if(arr[i][j]== -1){
                    arr[i][j] = 0 ;
                }
            }
        }

    }
   public static void main(String[] args) {
       int[][] arr={{1,1,1},{1,0,0},{1,1,1}};
//       brute(arr);
       System.out.println(Arrays.toString(arr[0]));
       System.out.println(Arrays.toString(arr[1]));
       System.out.println(Arrays.toString(arr[2]));
   }



}
