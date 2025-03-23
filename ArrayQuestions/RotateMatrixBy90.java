package ArrayQuestions;

import java.util.Arrays;

public class RotateMatrixBy90 {

    public static void rotateMatrix(int [][]arr){
        int [][] res = new int[arr.length][arr.length];
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(" ");
        System.out.println("  ");
        System.out.println("  ");
        for(int i = 0 ; i < arr.length ;i++){
            for(int j=0 ; j< arr.length; j++){
                res[j][(arr.length - 1)- i] = arr[i][j];
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][(arr.length-1-1)];
//                arr[j][(arr.length -1 -1)] = temp ;
            }
        }

        System.out.println(Arrays.toString(res[0]));
        System.out.println(Arrays.toString(res[1]));
        System.out.println(Arrays.toString(res[2]));
    }



    public static void rotateMatrix2(int [][]arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(" ");
        System.out.println("  ");
        System.out.println("  ");
        //transposing the matrix
        for(int i = 0 ; i < arr.length ;i++){
            for(int j=i+1 ; j< arr.length; j++){
                      int temp = arr[i][j];
                     arr[i][j] = arr[j][i];
                     arr[j][i] = temp ;
            }
        }
     //   reverse each row
        for(int i = 0 ; i < arr.length ; i++){
            reverse(arr[i]);
        }



        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }


    public static void reverse(int[] arr){
        for(int i = 0 ; i < arr.length/2; i ++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp ;
        }
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix2(arr);
    }
}
