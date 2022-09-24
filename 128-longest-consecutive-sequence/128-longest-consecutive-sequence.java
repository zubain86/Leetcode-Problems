class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        int i;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        i = 0;
        int count = 0;
        int maxseq = 1;
        while(i<nums.length)
        {
            if(!(set.contains(nums[i]-1)))
            {
                int j = nums[i];
                while(set.contains(j+count))
                    count++;
                if(count>maxseq)
                    maxseq = count;
                count = 0;
            }
            i++;
        }
        
        return maxseq;
       
    }
}