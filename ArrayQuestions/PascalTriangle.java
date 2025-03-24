package ArrayQuestions;

public class PascalTriangle {
    public static int getNcr(int n , int  r ){
        int res = 1 ;
        for(int i = 0 ; i < r;i++){
           res = res *(n- i)/(i+1);
        }
        return res;
    }
    public static void printTriangle(int k ){
        for(int i = 0 ; i < k ; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print(getNcr(i,j)+" ");
            }
            System.out.println(" ");
        }
    }


    public static void printPascalTriangleRow(int k ){
        System.out.println("this is a row solution ");
            for(int j = 0 ; j <= k; j++){
                System.out.print(getNcr(k,j)+" ");
            }
            System.out.println(" ");
    }

    public static void main(String[] args) {
        printTriangle(5);
        printPascalTriangleRow(5);
    }
}
