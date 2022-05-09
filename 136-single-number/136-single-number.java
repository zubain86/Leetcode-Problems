class Solution {
    public int singleNumber(int[] nums) {
        int i;
        int sum = 0;
        for(i=0;i<nums.length;i++)
        {
            sum = sum ^ nums[i];
        }
        return sum;
    }
}