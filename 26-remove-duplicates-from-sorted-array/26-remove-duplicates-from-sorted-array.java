class Solution {
    public int removeDuplicates(int[] nums) {
       //Using two pointer algorithm
        int start = 0;
        int end = 1;
        int pos = 1;
        while(end!=nums.length)
        {
            if(nums[start]==nums[end])
            {
            end = end + 1;
            }
            else
            {
                nums[pos] = nums[end];
                start = end;
                end++;
                pos++;
            }
}
       
        return pos;
        
    }
}