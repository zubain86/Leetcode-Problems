class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i,j;
        int flag = 0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                flag = 1;
                break;
}
            
}
        if(flag==1)
        return true;
            else
                return false;
     
}}