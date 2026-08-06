class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int [][] dp = new int[n+1][amount+1];

        for(int j = 1; j <= amount; j++){
            dp[0][j] = Integer.MAX_VALUE - 5;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= amount ; j++){
                if(coins[i-1] <= j){
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        if(dp[n][amount] == Integer.MAX_VALUE-5){
            return -1;
        }
        return dp[n][amount];
    }
}
