class Solution {
    public int longestSquareStreak(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i:nums)
            set.add(i);
         int max = Collections.max(set);
         Integer[] dp = new Integer[max+1];
        int cal = longestStreak(0,set,dp);
        if(cal==1 || cal==0)
            return -1;
        else
            return cal;
        
    }
      public int longestStreak(int start, TreeSet<Integer> num,Integer[] dp)
    {
        if(num.isEmpty())
        {
            return 0;
        }
        if(dp[start]!=null)
            return dp[start];
        if(start==0)
        {
           int  first = num.first();
           num.remove(num.first());
           int left =  longestStreak(first,num,dp);
           int right = longestStreak(0,num,dp);
           return dp[start] = Math.max(left,right);
        }
        else
        {
            if(num.contains(start*start))
            {

                int test= 1 + longestStreak(start*start,num,dp);
                return dp[start] = test;
            }
            else {
                return dp[start] = 1;
            }
        }
    }
}