class Solution {
    public int climbStairs(int n) {
        return climb(n,new int[n+1]);   
    }
    
  static int climb(int n,int[] dp)
    {
        if(n==1 || n==0)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        int left = 0,right = 0;
        left = climb(n-1,dp);
        if(n>1)
        right = climb(n-2,dp);
        return dp[n] =  left+right;
    }
}