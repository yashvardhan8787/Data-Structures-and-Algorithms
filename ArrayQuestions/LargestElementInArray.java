package ArrayQuestions;

public class LargestElementInArray {

    public int getLargestElement( int[] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] arr={3,2,1,5,2};
        LargestElementInArray lg = new LargestElementInArray();
        System.out.println(lg.getLargestElement(arr));
    }
}
