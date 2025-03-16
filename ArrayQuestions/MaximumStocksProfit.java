package ArrayQuestions;

public class MaximumStocksProfit {
    /* suppose u have array of six elements that represent the price of stock for the six days
    of week , and the buy day is given u have to find the day on which u will sell the stock
    so u will get maximum  profit .
     */

    public static void maximumProfit(int[] arr , int buyDay){
        if(buyDay == 6){
            return;
        }
        int sellingDay = buyDay ;

        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] > arr[sellingDay]){
                sellingDay= i ;
            }
        }
        int profit = arr[sellingDay] - arr[buyDay] ;
        System.out.println("selling stock on day :"+sellingDay+" u will get the profit of :"+ profit);
    }

    public static void main(String[] args) {
        int[] arr={7,3,6,4,1,5};
        maximumProfit(arr,5);
    }
}
