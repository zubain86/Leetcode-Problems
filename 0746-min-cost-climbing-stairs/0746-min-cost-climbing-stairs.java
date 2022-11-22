class Solution {
    public int minCostClimbingStairs(int[] cost) {
      Integer[] dp = new Integer[cost.length];
      int cost1 = minCostClimbingStairs(0,cost,dp);
      int cost2 = minCostClimbingStairs(1,cost,dp);
        return Math.min(cost1,cost2);
    }
    
     public int minCostClimbingStairs(int ind, int[] arr,Integer[] dp)
    {
        if(ind==arr.length-1 || ind==arr.length-2)
            return arr[ind];
        if(dp[ind]!=null)
            return dp[ind];
        int one = arr[ind] + minCostClimbingStairs(ind+1,arr,dp);
        int two = arr[ind] + minCostClimbingStairs(ind+2,arr,dp);
        return dp[ind] = Math.min(one,two);
    }
    
    
}