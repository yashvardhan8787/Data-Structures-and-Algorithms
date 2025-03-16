package ArrayQuestions;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    /*
    this is a brute force solution and is also used for both array of equal positive and Negative elements
    and unequal number of positive and negative elements
     */
    public static int[] BruteForceRearrange(int[] arr){
        int[] res= new int[arr.length];
        int[] pos= new int[arr.length];
        int[] neg= new int[arr.length];
        int posEl = 0 , negEl= 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[ i] >= 0){
                pos[posEl] = arr[i];
                posEl++;
            }else{
                neg[negEl] = arr[i];
                negEl++;
            }
        }

        int posCount = 0 , negCount = 0 , i=0 ;
        while(posCount <  posEl && negCount < negEl){
             if( i % 2 == 0  ){
                 res[i]= pos[posCount];
                 posCount++;
             }else{
                 res[i]= neg[negCount];
                 negCount++;
             }
             i++;
        }
        while(negCount<negEl){
            res[i]= neg[negCount];
            negCount++;
            i++;
        }

        while(posCount < posEl){
            res[i]= pos[posCount];
            posCount++;
            i++;
        }


        return  res;
    }
    /*
    rearrange the elements like on odd index have negative and even has positive .
    this method is best for case where number of positive and negative elements are same as n/2 is positive and negative
    time complexity of this method is big O(N) and space complexity is also O(N)
     */
    public static int[] rearrange(int[] arr){
       int[] res= new int[arr.length];
       int pos=0,neg =1;
       for(int i = 0 ; i < arr.length ; i++){
           if(arr[i] >= 0 ){
               res[pos]  = arr[i];
               pos += 2;
           }else{
               res[neg] = arr[i];
               neg += 2;
           }
       }
       return  res;
    }

    public static void main(String[] args) {
        /*
        this is a first array with the equal number of positive and negative numbers
        in this i have used optimal method , but it will work in only case where
        number of positive and number of negative elements are equal .
         */
        int[] arr={-1,-5,4,5,-2,3,6,-4};
        System.out.println(Arrays.toString(rearrange(arr)));

        /*
        second array  with two more positive elements than negative elements.
        used brute force approach.
         */
        int[] arr2={-1,-5,4,5,-2,3,6,-4,7,8};
        System.out.println(Arrays.toString(BruteForceRearrange(arr2)));
        /*
        third array with two more negative elements then the number of positive
        elements. used brute force approach .
         */
        int[] arr3={-1,-5,4,5,-2,3,6,-4,-7,-8};
        System.out.println(Arrays.toString(BruteForceRearrange(arr3)));
    }

}
