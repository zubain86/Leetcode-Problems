class Solution {
    public boolean isIdealPermutation(int[] nums) {
       int max = -1;
        int i;
        for(i=0;i<nums.length-2;i++)
        {
            max = Math.max(nums[i],max);
                if(max>nums[i+2])
                    return false;
        }
        return true;
}}