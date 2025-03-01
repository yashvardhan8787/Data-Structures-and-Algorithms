public class Hashing {
//    Hashing refers to the process of generating a
//    fixed-size output from an input of variable size
//    using the mathematical formulas known as hash functions.
//    This technique determines an index or location for
//    the storage of an item in a data structure.



    // find the frequency of N in integer array
    // 1,2,3,4,55,6,7,    n-8

    public static void main(String[] args) {
        int hash[] = new int[56];
        int arr[]= {1,2,2,2,2,3,4,55,6,6,6,7};

        //create a hash value of each value

        for(int i :arr){
            hash[i]++;
        }

        // now u can have frequency of any number
        //frequency of 55
        System.out.println( hash[55]);
        System.out.println( hash[2]);
        System.out.println( hash[6]);

    }
}
