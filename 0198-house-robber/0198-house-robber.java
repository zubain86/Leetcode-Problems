class Solution {
    public int rob(int[] nums) {
        Integer dp[] = new Integer[nums.length];
        int one = rob(0,nums,dp);
        int  two = Integer.MIN_VALUE;
        if(nums.length>1)
         two = rob(1,nums,dp);
        return Math.max(one,two);
    }
    public int rob(int ind,int[] cost,Integer[] dp)
    {
        if(ind==cost.length-1 || ind==cost.length-2)
            return cost[ind];
        if(dp[ind]!=null)
            return dp[ind];
        int max = Integer.MIN_VALUE;
        for (int i = ind+2; i < cost.length ; i++) {
            int c = cost[ind] + rob(i,cost,dp);
            max = Math.max(max,c);
        }
        return dp[ind] = max;
    }
    
}