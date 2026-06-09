class Solution {
    public int maxProfit(int[] prices) {
        int[] minArr = new int[prices.length];
        minArr[0] = prices[0];
        for (int i = 1; i < prices.length; i++){
            minArr[i] = Math.min(minArr[i - 1], prices[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, (prices[i] - minArr[i]));
        }
        return maxProfit;

    }
}