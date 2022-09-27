class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int i;
        int pro = 1;
        for(i=0;i<nums.length;i++)
        {
            pro = pro * nums[i];
            prefix[i] = pro;
        }
        pro = 1;
        for(i=nums.length-1;i>=0;i--)
        {
            pro = pro * nums[i];
            postfix[i] = pro;
        }
        for(i=0;i<nums.length;i++)
        {
            if(i==nums.length-1)
                nums[i] = prefix[i-1];
           else if(i==0)
                nums[i] = postfix[i+1];
               else
               {
                   nums[i] = prefix[i-1] * postfix[i+1];
               }
                
        }
        
        return nums;
    }
}