class Solution {
    public int tribonacci(int n) {
        Integer[] dp = new Integer[n+1];
        int res = tribonacci(n,dp);
        return res;
    }
    static int tribonacci(int n, Integer[] dp)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        if(dp[n]!=null)
            return dp[n];
        return dp[n] =  tribonacci(n-1,dp)+tribonacci(n-2,dp)+tribonacci(n-3,dp);
    }
}