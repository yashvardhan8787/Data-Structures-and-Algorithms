package JAVA_COLLECTIONS;

public class CollectionFirst {

  public static void main(String[] args) {
      /*Create an ArrayList of integers and perform the following operations:
        Add elements to the list.
        Remove an element from the list.
        Iterate through the list and print each element.*/
        java.util.ArrayList<Integer> intList = new java.util.ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.remove(Integer.valueOf(20));
        for (Integer num : intList) {
            System.out.println(num);
        }

        /*Create a HashSet of strings and perform the following operations:
        Add elements to the set.
        Check if a specific element exists in the set.
        Iterate through the set and print each element.*/
        java.util.HashSet<String> stringSet = new java.util.HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        System.out.println("Contains 'Hello': " + stringSet.contains("Hello"));
        for (String str : stringSet) {
            System.out.println(str);
        }

        /*Create a HashMap with keys as strings and values as integers. Perform the following operations:
        Add key-value pairs to the map.
        Retrieve a value based on a key.
        Iterate through the map and print each key-value pair.*/
        java.util.HashMap<String, Integer> stringIntMap = new java.util.HashMap<>();
        stringIntMap.put("One", 1);
        stringIntMap.put("Two", 2);
        System.out.println("Value for 'One': " + stringIntMap.get("One"));
        for (java.util.Map.Entry<String, Integer> entry : stringIntMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
