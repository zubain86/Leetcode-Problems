class Solution {
    public int countHillValley(int[] nums) {
        
      int i;
        int count = 0;
        for(i=1;i<nums.length-1;i++)
        {
            int l = i;
            int r = i;
            if(nums[i] == nums[i-1])
                continue;
            while(l>0 && r<nums.length - 1)
            {
                if(nums[l]==nums[l-1])
                    l--;
                else if(nums[r]==nums[r+1])
                    r++;
                else
                    break;
            }
            if(l==0 || r==nums.length-1)
                continue;
            else
            {
                l = l -1;
                r = r + 1;
            }


            if((nums[l]>nums[i] && nums[i]<nums[r]) || (nums[l]<nums[i] && nums[i]>nums[r]))
            {
                count++;
                System.out.println(i);
            }
        }

        return count;
    }
}