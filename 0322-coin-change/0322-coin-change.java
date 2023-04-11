class Solution {
     public  int coinChange(int [] coins, int amount)
    {
    Integer[][] dp = new Integer[coins.length][amount+1];
    int ch = helper(coins,amount,coins.length-1,dp);
         if(ch==1000000000)
             return -1;
         else
             return ch;
    }
    public  int helper(int[] coins, int amount, int ind, Integer[][] dp)
    {
        if(ind==0)
        {
            if(amount%coins[0]==0)
            {
            return amount/coins[ind];
            }
            else
            {
            return (int)Math.pow(10,9);
            }
        }
        if(dp[ind][amount]!=null)
        return dp[ind][amount];
        int take = (int)Math.pow(10,9);
        if(coins[ind]<=amount)       
        take = 1 + helper(coins,amount-coins[ind],ind,dp);
        int not_take = helper(coins,amount,ind-1,dp);

        return dp[ind][amount] = Math.min(take,not_take);

    }}