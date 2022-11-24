class Solution {
    public int longestPalindromeSubseq(String s) {
         return longestPalin(0,s.length()-1,s,new Integer[s.length()][s.length()]);           
    }
      public int longestPalin(int ind1,int ind2,String s,Integer[][] dp)
    {
        if(ind1>ind2)
            return 0;
        if(ind1==ind2)
            return 1;
        if(dp[ind1][ind2]!=null)
            return dp[ind1][ind2];
        if(s.charAt(ind1)==s.charAt(ind2))
            return dp[ind1][ind2] = 2 + longestPalin(ind1+1,ind2-1,s,dp);
        int left = longestPalin(ind1+1,ind2,s,dp);
        int right = longestPalin(ind1,ind2-1,s,dp);
        return dp[ind1][ind2] = Math.max(left,right);
    }

}