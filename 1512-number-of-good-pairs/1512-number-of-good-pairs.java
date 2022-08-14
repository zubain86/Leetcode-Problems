class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int i,j;
        i = 0;
        j = i+1;
        while(i<nums.length-1)
        {
            if(nums[i]==nums[j])
                count++;
            if(j==nums.length-1)
            {
                i++;
                j=i;
            }
            j++;
                
        }
        return count;
    }
}