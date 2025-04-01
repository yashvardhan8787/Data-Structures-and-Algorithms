package JAVA_COLLECTIONS;

import java.util.LinkedList;
import java.util.List;

public class SecondLargestElementInList {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        for(int i = 1 ; i < 5 ; i++){
            for(int j = 1 ; j< i; j++){
                l1.add(j);
            }
        }



        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;


        for (int i:l1) {
            if(i >  largest){
                largest2= largest ;
                largest = i ;
            }

        }

        System.out.println(largest2);



    }
}
