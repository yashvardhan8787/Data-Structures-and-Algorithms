package JAVA_COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class InterSectionOfTwoLists {

    public static List<Integer> getIntersection(List<Integer> l1 ,List<Integer> l2 ){
        List<Integer> res= new ArrayList<>();
        for (int i :l1) {
            if(l2.contains(i)){
                res.add(i);
            }
        }
        return  res;
    };
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<>();
        for(int i = 1 ; i < 10 ; i++){
            l1.add(i);
        }
        List<Integer> l2= new ArrayList<>();
        for(int i = 1 ; i < 6 ; i++){
            l2.add(i);
        }

        System.out.println("Intersection :"+getIntersection(l1,l2));

    }
}
