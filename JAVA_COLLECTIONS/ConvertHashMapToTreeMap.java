package JAVA_COLLECTIONS;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConvertHashMapToTreeMap {
    public static void main(String[] args) {
        Map<Integer,Integer> hash= new HashMap<>();
        hash.put(1,3);
        hash.put(2,3);
        hash.put(3,3);
        Map<Integer,Integer> tree= new TreeMap<>();
        tree.putAll(hash);


        System.out.println(tree);
    }
}
