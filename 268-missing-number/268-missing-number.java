class Solution {
    public int missingNumber(int[] nums) {
        int i;
        int count = 0;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            if(count != nums[i])
            {
                break;
}
            count++;
        
    }
        return count;
}}