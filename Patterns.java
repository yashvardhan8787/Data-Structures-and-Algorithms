public class Patterns {
    public void pattern1(int n ){
        for(int i = 0; i <n;i++){          // * * *
            for(int j = 0; j <n;j++){      // * * *
                System.out.print(" * ");   // * * *
            }
            System.out.println("");
        }
    }

    public void pattern2(int n ){
        for(int i = 0; i <n;i++){          // *
            for(int j = 0; j <i;j++){      // * *
                System.out.print(" * ");   // * * *
            }
            System.out.println("");
        }
    }



    public void pattern3(int n){
        for(int i = 0; i <n;i++){          // * * *
            for(int j = n; j >i;j--){      // * *
                System.out.print(" * ");   // *
            }
            System.out.println("");
        }
    }


    public void pattern4(int n){
        for(int i = 0; i <n;i++){          // 1
            for(int j = 1; j <=i;j++){     // 1 2
                System.out.print(j);       // 1 2 3
            }
            System.out.println("");
        }
    }

    public void pattern5(int n){
        for(int i = 0; i <n;i++){          // 1
            for(int j = 1; j <=i;j++){     // 2 2
                System.out.print(i);       // 3 3 3
            }
            System.out.println("");
        }
    }

    public void pattern6(int n){
        for(int i = 0; i <n;i++){          // 123
            for(int j = n; j >i;j--){      // 12
                System.out.print(n-j);     // 1
            }
            System.out.println("");
        }

    }

    public void pattern7(int n){
//                                                 *
//                                                ***
//                                               *****
//                                              *******
//                                             *********
        for(int i =0 ; i < n ; i++){
            //space
             for(int j=n ; j> i ; j--){
                 System.out.print(" ");
             }
             //stars
             for(int j=0 ; j < 2*i+1 ; j++){
                 System.out.print("*");
             }
             //another space
             for(int j=n ; j> i ; j--){
                 System.out.print(" ");
             }
             System.out.println("");

         }
    }



    public void pattern8(int n){
        //  *****
        //  ***
        //   *

//
        for(int i = 0 ; i <n ; i++){
            //space
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0 ; j < n-i ; j++){
                System.out.print(" *");
            }
            //space
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public void pattern9(){
        //combine above two patterns
        for(int i =0 ; i < 5 ; i++){
            //space
             for(int j=5 ; j> i ; j--){
                 System.out.print(" ");
             }
             //stars
             for(int j=0 ; j < 2*i+1 ; j++){
                 System.out.print("*");
             }
             //another space
             for(int j=5 ; j> i ; j--){
                 System.out.print(" ");
             }
             System.out.println("");

         }
        for(int i = 0 ; i <5 ; i++){
            //space
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0 ; j < 5-i ; j++){
                System.out.print(" *");
            }
            //space
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public void pattern10(int n ){
        for(int i = 0; i < 2 * n  ; i++ ){
             int x = i;
             if(i > n) x = (2*n-i) ;
             for(int j=0; j<x ;j++){
                 System.out.print(" *");
             }
             System.out.println(" ");
         }

    }

    public void pattern11(int n){
        for(int i = 0; i < n ; i++){  //1
            int x = 0;                //01
            if(i % 2 != 0 )  x = 1 ;  //101
            for(int j = 0 ; j < i ; j++){
                System.out.print(x);
                x=1-x;
            }
            System.out.println(" ");
        }
    }

    public void pattern12(int n){
        for(int i = 0 ; i <n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("  ");
            }
            for(int j = i ; j > 0 ; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }


    public void pattern13(int n){
        int x = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<i;j++ ){
                System.out.print(" "+x);
                x++;
            }
            System.out.println(" ");
        }
    }

    public void pattern14(int n){
        for(int i = 0 ; i < n ; i++){
            for(char ch = 'A' ; ch <='A'+i;ch++ ){
                System.out.print(" "+ch);

            }
            System.out.println(" ");
        }
    }

    public void pattern15(int n){
        for(int i = 0 ; i < n; i++){
            for(char ch = 'A' ; ch <'A'+n-i;ch++ ){
                System.out.print(" "+ch);

            }
            System.out.println(" ");
        }
    }


    public void pattern16(int n){
        for(char cx = 'A' ; cx <='A'+ n ; cx++){
            for(char ch = 'A' ; ch <= cx;ch++ ){
                System.out.print(" "+cx);

            }
            System.out.println(" ");
        }
    }


    public void pattern17(int n){
       for(int i = 0 ; i< n ; i++){
            for(int j= 0 ;j<n-i;j++){           // A
                System.out.print(" ");         // ABA
            }                                 // ABCBA
            char ch='A';
            for(int j=0 ; j < 2*i+1 ; j++){
                 System.out.print(ch);
                 if(j < (2*i+1 )/2) ch++; else ch--;
             }

            for(int j= 0 ;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }


    public void pattern18(int n){
        char ch='E' ;                        //E
        for(int i = 0 ; i < n ; i++){        //DE
            char ch2= ch;                    //CDE
            for(int j=0 ; j<=i ; j++){
                System.out.print(ch2);
                ch2++;
            }
            ch--;
            System.out.println(" ");
        }
    }


    public void pattern19(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5-i ;j++ ){
                System.out.print(" *");
            }
            for(int j = 0 ; j < 2*i+1 ;j++ ){
                System.out.print("  ");
            }
            for(int j = 0 ; j < 5-i ;j++ ){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for(int i = 0 ; i < 5 ; i++){
            for(int j =0; j <= i ;j++ ){
                System.out.print(" *");
            }
            for(int j = 0 ; j <2*5 -( 2*i+1) ;j++ ){
                System.out.print("  ");
            }
            for(int j =0; j <= i ;j++ ){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public void pattern20(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j =0; j <= i ;j++ ){
                System.out.print(" *");
            }
            for(int j = 0 ; j <2*5 -( 2*i+1) ;j++ ){
                System.out.print("  ");
            }
            for(int j =0; j <= i ;j++ ){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5-i ;j++ ){
                System.out.print(" *");
            }
            for(int j = 0 ; j < 2*i+1 ;j++ ){
                System.out.print("  ");
            }
            for(int j = 0 ; j < 5-i ;j++ ){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }


    public void pattern21(int n){
        for(int i = 0; i <n;i++){
            for(int j = 0; j <n;j++){
                 if(i==0 || j==0 || i==4 || j==4) {
                     System.out.print(" *");
                 } else{
                     System.out.print("  ");
                 }
            }
            System.out.println("");
        }
    }


    public void pattern22(int n){
        for(int i = 0; i <n;i++){
            for(int j = 0; j <n;j++){
                int minDist = Math.min(Math.min(i, j), Math.min(n- 1 - i, n - 1 - j));
                System.out.print(" " +minDist);
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {

        //outer loop number of line (rows)
        //inner loops focus  columns
        // print inside the inner for loop
        //observe symmetry
        Patterns p =new Patterns();
        p.pattern22(5);












    }
}
