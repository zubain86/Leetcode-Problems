class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int ind1 = text1.length();
        int ind2 =  text2.length();
        Integer[][] dp  = new Integer[ind1][ind2];
         return (longest(ind1-1,ind2-1,text1,text2,dp));
    }
     public int longest(int ind1,int ind2, String s1, String s2,Integer[][] dp)
    {
         if(ind1< 0 || ind2 < 0)
             return 0;
         if(dp[ind1][ind2]!=null)
             return dp[ind1][ind2];
         if(s1.charAt(ind1)==s2.charAt(ind2))
         {
           return dp[ind1][ind2] = 1 + longest(ind1-1,ind2-                          1,s1.substring(0,ind1),s2.substring(0,ind2),dp);
         }
         int first = longest(ind1-1,ind2,s1.substring(0,ind1),s2,dp);
         int last = longest(ind1,ind2-1,s1,s2.substring(0,ind2),dp);
         return dp[ind1][ind2] = Math.max(first,last);
    }
}