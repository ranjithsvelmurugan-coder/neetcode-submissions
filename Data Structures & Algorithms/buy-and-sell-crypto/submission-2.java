class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int i = 0 , j = 1 ;
        while(j<n){
            if(prices[i] >= prices[j]){
                i = j;
            }
            else{
                maxProfit = Math.max(maxProfit,(prices[j]-prices[i]));
            }
            j++;
        }
        return maxProfit;
    }
}
