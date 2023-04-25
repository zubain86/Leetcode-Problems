class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp = new Integer[coins.length][amount+1];
        return helper(coins,amount,coins.length-1,dp);
    }
    public int helper(int[] coins, int amount, int ind,Integer[][] dp)
    {
        if(ind==0)
        {
            if(amount%coins[0]==0)
                return 1;
            else
                return 0;
        }
        if(dp[ind][amount]!=null)
            return dp[ind][amount];
        int take = 0;
        if(amount>=coins[ind])
            take = helper(coins,amount-coins[ind],ind,dp);
        int not_take = helper(coins,amount,ind-1,dp);
        
        return dp[ind][amount] = take + not_take;
    }
}