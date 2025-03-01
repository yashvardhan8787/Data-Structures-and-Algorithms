public class Recursion {
    public void printName(  int i,int n ){
        if(i == n ){
            System.out.println("yash");
            return;
        }else{
            System.out.println("yash");
            printName(i+1, n);
        }
    }


   public int printFibo( int n){  // it's an example of backtracking
        if( n == 0 || n==1){
            return 1;
        }else{
            return n = printFibo(n-1)+ printFibo(n-2);
        }

   }
   //print n
    public void printN( int i ,int n){
        if(n == i){
            return;
        }
        printN(i+1,n);
        System.out.println(i);
    }

    public void printJ(int n){
        if(n == 0){
            return;
        }
        printJ(n-1);
        System.out.println(n);
    }


    public int printSumN(int n ){
        if(n == 0 ){
            return 0;   //find sum of N positive integer
        }
        return n + printSumN(n-1);
    }

    public int factorial(int n ){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public int[] reverseArray(int i , int j ,int arr[]){
        if(i == j ){
            return arr;
        }
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];

        return  reverseArray(i+1,j-1 ,arr);
    }


    public  boolean checkPalindrome(int i ,String str){
        int n = str.length();
        if(i == n/2){
            return  true;
        }
        else if(str.charAt(i) != str.charAt(n-i-1) ){
            return  false;
        }
        return checkPalindrome(i+1,str);
    };


    public static void main(String[] args) {
        Recursion R = new Recursion();
       // R.printName(1,5);
//        for(int i = 0 ; i <7; i++){
//            System.out.println(R.printFibo(i));
//        }
//        R.printN(1,6);
 //       R.printJ(6);
//        System.out.println(R.printSumN(10));
//        System.out.println(R.factorial(5));




        int[] array= {1,2,3,4,5,};
        R.reverseArray(0,4,array);

        for(int i = 0 ; i< 4;i++){
            System.out.println(array[i]);
        }
        System.out.println(R.checkPalindrome(0,"mom"));
    }
}


