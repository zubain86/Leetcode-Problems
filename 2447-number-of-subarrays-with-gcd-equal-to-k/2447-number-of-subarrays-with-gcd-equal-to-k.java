class Solution {
    public int subarrayGCD(int[] nums, int k) {
     int i,j;
        int count = 0;
        for(i=0;i<nums.length;i++)
        {
            int gcd = nums[i];
            for(j=i;j<nums.length;j++)
            {
                gcd = greatestCommon(gcd,nums[j]);
                if(gcd==k)
                    count++;
                else if(gcd<k)
                    break;
            }
        }
        return count;
}
    public int greatestCommon(int a, int b) {
    if (a == 0)
        return b;

    while (b != 0) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a;
}
}