class Solution {
    public int rob(int[] nums) {
    
        if(nums.length==1)
            return nums[0];
        int[] arr1 = new int[nums.length-1];
         int[] arr2 = new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
               arr1[i] = nums[i];
        }
        int k = 1;
        for (int i = 0; i < nums.length-1 ; i++) {
            arr2[i] = nums[k++];
        }
        Integer[] dp = new Integer[nums.length];
        int one = rob(0,arr1,dp);
        int two = rob(1,arr1,dp);
        dp = new Integer[nums.length];
        int three = rob(0,arr2,dp);
        int four = rob(1,arr2,dp);
        int max1 = Math.max(one,two);
        int max2 = Math.max(three,four);
        return Math.max(max1,max2);

        
    }
    
     static int rob(int ind,int[] cost,Integer[] dp)
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