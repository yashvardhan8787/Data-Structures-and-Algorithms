public class Practice {
    /*Write a Java program to reverse a string without using library functions.

    Write a Java method to check if a number is prime.

    Write a Java program to find the second-highest number in an array.

    Implement a function that counts vowels and consonants in a given string.

    Write a Java program to check if a string is a palindrome.*/


    public static String reverse(String str){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            res.insert(0, str.charAt(i));
        }
        return res.toString();
    }


    public static int secondHighest(int[] arr){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        if(arr.length <= 1 ) return -1;

        for (int j : arr) {
            if (j > highest) {
                secondHighest = highest;
                highest = j;
            } else if (j < highest && j > secondHighest) {
                secondHighest = j;
            }
        }
        return secondHighest ;
    }


    public static  boolean checkIsPrime(int n){
        if(n < 2) return false;
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
           if(n % i == 0){
               count++;
           }
        }

        return count == 2;
    }

    public static void getVowelsAndConstants(String str){
        int constant = 0;
        int vowels = 0;
        for(int i = 0 ; i < str.length(); i++ ){
            switch (str.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                default -> constant++;
            }
        }
        System.out.println("vowels: " +vowels+"   constants:"+constant);
    }


    public static boolean checkIsPalindrome(String str){
        boolean isPalindrome = true;
        for(int i = 0 ; i <= str.length() / 2 ; i++ ){
            if(str.charAt(i) != str.charAt(str.length() - i -1)){
              isPalindrome =false;
            }
        }
        return  isPalindrome ;

    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(secondHighest(arr));
        System.out.println( checkIsPrime(7));
        System.out.println( checkIsPrime(8));
        getVowelsAndConstants("Hello");
        System.out.println(checkIsPalindrome( "MOM"));
        System.out.println(checkIsPalindrome( "PAPA"));
    }
}
