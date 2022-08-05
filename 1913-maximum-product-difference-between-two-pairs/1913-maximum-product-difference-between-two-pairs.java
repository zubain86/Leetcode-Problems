class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int pro1 = nums[nums.length-1]*nums[nums.length-2];
        int pro2 = nums[0] * nums[1];
        int res = pro1 - pro2;
        return res;
        
    }
}