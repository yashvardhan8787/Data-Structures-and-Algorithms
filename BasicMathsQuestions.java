import org.w3c.dom.ls.LSOutput;

public class BasicMathsQuestions {

    public void countDigitsInNumber(int n){
        int count= 0 ;
        while(n>0){   //time complexity is log base 10(N) because here n/10
            count++;
            n= n / 10 ;
        }
        System.out.println("number of digits are "+count);
    }

    public void reverseNumber(int n){
       int  reverseNum=0;
       while(n > 0){
           reverseNum = reverseNum * 10 +(n%10);
           n= n/10;
       }
        System.out.println("reverse number is "+reverseNum);
    }



    public void checkPalindrome(int n){
        int temp=n ;
        int  reverseNum=0;
        while(n > 0){
            reverseNum = reverseNum * 10 +(n%10);
            n= n/10;
        }
        if(temp==reverseNum){
            System.out.println("yes it is a palindrome");
        }else{
            System.out.println("no, it is not  a palindrome");
        }

    }

    public void isArmStrongNumber(int n){
        int number=n;
        int sum=0 ;
        while(n > 0){
            int x = n % 10 ;
            sum= sum + ((x)*(x)*(x));
            n=n/10;
        }
        if(number ==  sum){
            System.out.println("yes it is a armstrong number");
        }else{
            System.out.println("no, it is not  a armstrong number");
        }

    }


    public void printAllDivisors(int n ){
        System.out.print("factors of "+n+" are");
        for(int i=1; i <= n ;i++){   // time complexity = O(N)
            if(n%i==0){
                System.out.print(" ,"+i);
            }
        }
        System.out.println(" ");
    }


    public void allFactors(int n){
        System.out.print("factors of "+n+" are");
        for(int i=1; i <= Math.sqrt(n) ;i++){// time complexity = O(sqrt(N))
            if(n%i==0){
                System.out.print(" ,"+i);
                if(i != n/i) System.out.print(" ,"+(n/i));
            }
        }
        System.out.println(" ");
    }



    public void isPrime(int n ){
        int count=0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                count++;
                if(count > 2 ){     // worst case -> O(N)
                    break;
                }
            }
        }
        if (count > 2) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

    }

    // HCF and GCD is same i m making two methods to with diff time complexity
    public void greatestCommonDivisor(int y , int x){
        int count=0;
        int n ;
        if(x > y){    // worst case -> O(min(N,N1))
            n=y;
        }else{
            n=x;
        }
        for(int i = n ; i >= 1 ; i-- ){
            count++;
            if(x % i == 0 && y % i==0 ){
                System.out.println("highest common factor "+count);
                break;
            }
        }
    };

    public void highestCommonFactor(int y , int x){
      while(x >0 && y >0){
          if(x > y){
              x=x%y;
          }else{
              y=y%x;
          }
      }
      if(x==0) {
          System.out.println(y);
      }else{
          System.out.println(x);
      }
    }




    public static void main(String[] args) {

        BasicMathsQuestions m = new BasicMathsQuestions();
        m.countDigitsInNumber(199);
        m.reverseNumber(199);
        m.checkPalindrome(100);
        m.checkPalindrome(99);
        m.isArmStrongNumber(135);
        m.printAllDivisors(36);
        m.allFactors(36);
        m.isPrime(4);
        m.highestCommonFactor(6,9);
        m.highestCommonFactor(9,6);
        m.greatestCommonDivisor(9,6);

    }
}




