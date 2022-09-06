class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length!=1)
        {
            int idx1 = 0,idx2 = 0;
            int i;
            int flag = 0;
            for(i=nums.length-2;i>=0;i--)
            {
                if(nums[i]<nums[i+1])
                {
                    idx1 = i;
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
            {
                for(i=nums.length-1;i>=0;i--)
                {
                    if(nums[idx1]<nums[i])
                    {
                        idx2 = i;
                        break;
                    }
                }
                int temp = nums[idx2];
                nums[idx2] = nums[idx1];
                nums[idx1] = temp; 
                Arrays.sort(nums,idx1+1,nums.length);
            }
            else
            {
                Arrays.sort(nums);
            }
        }
        
    }
}