package ArrayQuestions;

public class LinearSearch {

    public static  int linearSearch(int arr[],int n ){
        for(int i = 0 ;i < arr.length; i++  ){
          if(arr[i] == n){
              return  i ;
          }
        }
        return  -1;
    }
    public static void main(String[] args) {
     int[] arr={1,23,4,5,5,6,7,7,4,6,8,9,21,45,6};
        System.out.println(linearSearch(arr,23));
        System.out.println(linearSearch(arr,99));




    }
}
