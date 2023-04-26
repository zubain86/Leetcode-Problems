class Solution {
    public int minOperations(int[] nums) {
       int c = 0;
       for(int i = 0;i<nums.length;i++)
       {
           if(nums[i]==1)
               c++;
       }
       if(c>0)
           return nums.length - c;
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            int num = nums[i];
            for(int  j = i+1;j<nums.length;j++)
            {
                num = gcd(num,nums[j]);
                if(num==1)
                {
                    ans = Math.min(ans,j-i);
                    break;
                }
            }
            if(num!=1)
                break;
        }
        
        if(ans==Integer.MAX_VALUE)
            return -1;
        else
            return nums.length -1 + ans;
    }
    public int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}