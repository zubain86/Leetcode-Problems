class Solution {
    public int majorityElement(int[] nums) {
        int i,count=1;
        int result = 0;
        int n = nums.length;
        Arrays.sort(nums);
        if(n>1)
        {
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                 count++;
            }
            else
            {
                count = 1;
            }
            if(count>n/2)
            {
                result = nums[i];
            }
            
            
        }
        return result;
        }
        else
        {
            return 1;
         }
        
    }
}