class Solution {
    public int majorityElement(int[] nums) {
        int ansIndex = 0;
        int count = 1;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[ansIndex])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                ansIndex = i;
                count = 1;
            }
        }
        count = 0 ;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[ansIndex])
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
            return nums[ansIndex];
        }
        return -1;
        
    }
}