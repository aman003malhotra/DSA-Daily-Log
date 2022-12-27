// 121. Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

package ARRAY_QUESTIONS;
public class BestTimetoBuyandSellStock{
    public static void main(String[] args) {
        System.out.println("hello0");
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i< prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                max = Integer.MIN_VALUE;
            }
            if (prices[i] > max){
                max = prices[i];
            }
            int currentProfit= max-min;
            if(max != Integer.MIN_VALUE && min != Integer.MAX_VALUE){
                if(currentProfit > profit)
                profit = currentProfit;
            }
        }
        return profit;
    }
}