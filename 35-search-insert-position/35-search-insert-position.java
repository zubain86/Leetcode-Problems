class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int index=0;
        while(i<nums.length && nums[i]<=target)
        {
            index = i;
            i++;
}
        if(target>nums[index])
            return index+1;
        else
            return index;
        
    }
}