package DSA250.Array.Easy;

public class BestToBuy_Sell_Stocks {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy + 1;
        int maxProfit = 0;
        while (sell < prices.length) {
            int profit = prices[sell] - prices[buy];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (sell == prices.length - 1) {
                buy++;
                sell = buy + 1;
            } else {
                sell++;
            }
        }
        return maxProfit;
    }
}
