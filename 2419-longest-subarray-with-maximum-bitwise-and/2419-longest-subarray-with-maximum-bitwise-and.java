class Solution {
    public int longestSubarray(int[] nums) {
     int i;
        int max = 0;
        for(i=0;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
        }
        int and = 0;
        int count = 0;
        int maxcount = 0;
        for(i=0;i<nums.length;i++)
        {
            and = nums[i];
            if(and==max)
            {
                count++;
                if(maxcount<count)
                    maxcount = count;
            }
            else
            {
                and = 0;
                count = 0;
            }
        }
        
        return maxcount;
    }
}