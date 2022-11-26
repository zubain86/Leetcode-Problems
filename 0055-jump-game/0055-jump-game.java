class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return (jumpgame(0,nums,dp));
        
    }
      public boolean jumpgame(int ind,int[] nums,Boolean[] dp)
    {
        if(ind==nums.length-1)
            return true;
         if(ind>nums.length-1)
             return false;
        if(nums[ind]==0)
            return false;
      if(dp[ind]!=null)
          return dp[ind];
         boolean count = false;
          int flag = 0;
          for (int i = 1; i <= nums[ind]; i++) {
             count = jumpgame(ind + i,nums,dp);
            if(count==true)
            {
                flag = 1;
                break;
        }}
        if(flag==1)
            return true;
        return dp[ind] = count;
    }
}