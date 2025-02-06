package LeetCode;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 11, 4}));
    }

    private static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int profit = prices[i] - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
