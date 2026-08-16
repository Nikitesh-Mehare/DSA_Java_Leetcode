public class Solution {

    // Method to calculate the maximum profit
    public int maxProfit(int[] prices) {
        // int buy_price = Integer.MAX_VALUE;
        // int maxProfit = 0;

        // for (int i =0; i < prices.length; i++) {
        //     // Update the minimum price if a lower price is found
        //     if (prices[i] < buy_price) {
        //        buy_price = prices[i];
        //     } else {
        //         // Calculate profit and update maxProfit if it's higher
        //         int currentProfit = prices[i] - buy_price;
        //         maxProfit = Math.max(maxProfit, currentProfit);  //5

        int min = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
        min = Math.min(min, price);
        profit = Math.max(profit, price - min);
        }
        return profit;

       // return maxProfit;
    }
}
