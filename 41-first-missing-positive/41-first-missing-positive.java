import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
        int i;
        int max = 0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max = nums[i];
        }
        if(max>0)
        {
            for(i=0;i<nums.length;i++)
            {
                set.add(nums[i]);
            }
            
            for(i=1;i<=max;i++)
            {
                if(set.contains(i))
                    continue;
                else
                    return i;
            }
            return max+1;
        }
        else
        {
             return 1;
        }
        
    }
}