class Solution {
    public void sortColors(int[] nums) {
        int count=0,count1=0,count2=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                count++;
            if(nums[i]==1)
                count1++;
            if(nums[i]==2)
                count2++;
        }
        i=0;
        while(i<count)
            nums[i++]=0;
        while(i<count1+count)
            nums[i++]=1;
        while(i<count2+count1+count)
            nums[i++]=2;
        
    }
}