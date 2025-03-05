package ArrayQuestions;

public class RotateArrayByLeft {

    public static void rotateByOne(int[] arr){
        int temp =arr[0];
        for(int i =0 ; i < arr.length ; i++){
            if(i == arr.length -1){
                arr[i] = temp;
                temp=arr[0];
            }else{
                arr[i] = arr[i+1];
            }
        }
    }


    public static void rotateByNplace(int[] arr,int n){
        int temp =arr[0];
        for(int i =0 ; i < n*(arr.length) ; i++){
            if((i % arr.length)== arr.length -1){
                arr[i % arr.length] = temp;
                temp=arr[0];
            }else{
                arr[(i % arr.length)] = arr[(i % arr.length)+1];
            }
        }
    }


    public static void removesZeroToEnd(int[] arr){
      int j= -1;
      for(int i  = 0 ; i < arr.length; i++){
          if(arr[i] == 0 ){
              j =i ;
              break;
          }
      }

      if( j == -1 ) return;
      for(int i  = j+1 ; i < arr.length; i++){
            if(arr[i] != 0 ){
                System.out.print("[");
                for (int z : arr) {
                    System.out.print(z+", ");
                }
                System.out.println("]");
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                j++;
            }
      }

    }

    public static void main(String[] args) {

        int[] arr ={1,3,0,4,5,6,0,0,7,8,9,7};
//        rotateByOne(arr);

//
//        rotateByNplace(arr,4);

          removesZeroToEnd(arr);
          for (int i : arr) {
            System.out.print(i+", ");
        }
    }
}
