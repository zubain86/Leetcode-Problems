class Solution {
    public int removeElement(int[] nums, int val) {
        int i,k=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
              continue; 
            }
            else
            {
                nums[k] = nums[i];
                k++;
            }
}
        return k;
    }
}