class Solution {
    public void moveZeroes(int[] nums) {
        int i,k=0,count=0;
        for(i=0;i<nums.length;i++)
        {
          if(nums[i]!=0)
          {
            nums[k] = nums[i];
              k++;
          }
            else
            {
                count++;
            }
        }
        if(count!=0)
        {
        for(i=k;i<nums.length;i++)
        {
           nums[i] = 0;
        }
        }
    }
}