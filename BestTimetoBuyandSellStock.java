public class  BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int maxprofit = 0;
        int sellDay =0;
        int buyDay =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min= prices[i];
                buyDay = i;
            }
            int profit = prices[i] - min;
            if (profit>maxprofit){
                maxprofit = profit;
                sellDay=i;
            }
        }
         System.out.println("Buy on day " + (buyDay+1)
                + " at price " + prices[buyDay]);

        System.out.println("Sell on day " + (sellDay+1)
                + " at price " + prices[sellDay]);
                return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit = " + result);
        int[] prices1 = {7, 6, 4, 3, 1};
        int result1 = maxProfit(prices1);
        System.out.println("Maximum Profit = " + result1);
    }

}
