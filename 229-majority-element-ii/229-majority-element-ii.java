class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> list = new ArrayList<>();
          int ansIndex0 = 0;
          int ansIndex1 = 0;
        
        int count0 = 0;
        int count1 = 0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[ansIndex0])
            {
                count0++;
            }
            
            else if(nums[i]==nums[ansIndex1])
            {
                count1++;
            }
            else if(count0==0)
            {
                ansIndex0 = i;
                count0 = 1;
            }
            else if(count1==0)
            {
                ansIndex1 = i;
                count1 = 1;
            }
                else{
                count0--;
                count1--;
            }
           
        }
        count0 = 0 ;
        count1 = 0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[ansIndex0])
            {
                count0++;
            }
        else   if(nums[i]==nums[ansIndex1])
            {
                count1++;
            }
        }
        if(count0>nums.length/3)
        {
            list.add(nums[ansIndex0]);
        }
        if(count1>nums.length/3)
        {
            list.add(nums[ansIndex1]);
        }
        
        
         return list;
        
    }
}