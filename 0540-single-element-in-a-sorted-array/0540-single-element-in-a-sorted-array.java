class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
    
        int i = 0;
        int j = nums.length-1;
        while(i<=j)
        {
            if(nums[i]!=nums[i+1])
                return nums[i];
            if(nums[j]!=nums[j-1])
                return nums[j];
            if(nums[i]==nums[i+1])
                i+=2;
            if(nums[j]==nums[j-1])
                j-=2;
        }
    
        return -1;
    }
    
   
}