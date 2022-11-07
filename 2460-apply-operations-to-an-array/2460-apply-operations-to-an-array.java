class Solution {
    public int[] applyOperations(int[] nums) {
        int i;
        int[] res = new int[nums.length];
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        int k = 0;
        for(i=0;i<nums.length;i++)
        {
              if(nums[i]!=0)
                res[k++] = nums[i];
        }
        return res;
}
}