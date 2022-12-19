class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp = new Integer[nums.length][nums.length+1];
        return helper(0,-1,nums,dp);
        
    }
    
    public int helper(int ind,int pre_ind,int[] arr,Integer[][] dp)
    {
        if(ind==arr.length)
            return 0;
        if(dp[ind][pre_ind+1]!=null)
            return dp[ind][pre_ind+1];
        int len = 0 + helper(ind+1,pre_ind,arr,dp);
        if(pre_ind==-1 || arr[ind]>arr[pre_ind])
            len = Math.max(len,1 + helper(ind+1,ind,arr,dp));
        return dp[ind][pre_ind+1] = len;

    }
}