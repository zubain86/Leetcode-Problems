class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        long[] res = new long[nums.length];
        int max = 0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(max<nums[i])
                max = nums[i];
            nums[i] = nums[i] + max;
            if(i>0)
            res[i] = res[i-1] + nums[i];
            else
                res[i] = nums[i];
                
        }
        
        
        return res;
        
        
    }
}