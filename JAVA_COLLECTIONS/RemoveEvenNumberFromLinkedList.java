package JAVA_COLLECTIONS;

import com.sun.jdi.IntegerValue;

import java.util.LinkedList;
import java.util.List;

public class RemoveEvenNumberFromLinkedList {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        for(int i = 1 ; i < 5 ; i++){
            for(int j = 1 ; j< i; j++){
                l1.add(j);
            }
        }
        //before removing
        System.out.println(l1);

        //after removing
        for(int i = 0 ; i < l1.size(); i++){
            if(l1.get(i) % 2 == 0 ){
                l1.remove(i);
            }
        }

        System.out.println(l1);

    }
}
