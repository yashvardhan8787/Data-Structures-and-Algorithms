package JAVA_COLLECTIONS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {
    public static Map<Integer,Integer>  ConvertToMap(List<Integer> l1){
      Map<Integer,Integer> res= new HashMap<>();
        for (int i: l1) {
           res.put(i,res.getOrDefault(i,0)+1);
        }
      return res;
    }  ;

    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<>();
        for(int i = 1 ; i < 5 ; i++){
            for(int j = 1 ; j< i; j++){
               l1.add(j);
            }
        }
        System.out.println("this is list :"+l1);
        System.out.println("this is map :"+ConvertToMap(l1));





    }
}
