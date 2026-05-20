class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int minSell = prices[0];
        for (int i = 0; i<prices.length; i++){
            maxp = Math.max(maxp,prices[i]-minSell);
            minSell = Math.min(minSell,prices[i]);
        }
        return maxp;
    }
}
