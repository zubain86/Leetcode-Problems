class Solution {
    public int jump(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return (jumpgame(0,nums,dp));
        
    }
      public int jumpgame(int ind,int[] nums,Integer[] dp)
    {
        if(ind>=nums.length-1)
            return 0;
        if(nums[ind]==0)
            return (int)(Math.pow(10,4));
      if(dp[ind]!=null)
          return dp[ind];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= nums[ind]; i++) {
            int count = 1 +  jumpgame(ind + i,nums,dp);
            min = Math.min(count,min);
        }

        return dp[ind] = min;
    }
}