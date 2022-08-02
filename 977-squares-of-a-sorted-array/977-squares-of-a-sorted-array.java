class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums2[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums2);
        return nums2;
    }
}