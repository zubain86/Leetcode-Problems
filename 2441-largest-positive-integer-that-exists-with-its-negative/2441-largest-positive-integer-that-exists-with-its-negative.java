class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int i;
        int max = 0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && nums[i]>max)
            {
                if(set.contains(-nums[i]))
                    max = nums[i];
            }
        }
        if(max==0)
            return -1;
        return max;
    }
}