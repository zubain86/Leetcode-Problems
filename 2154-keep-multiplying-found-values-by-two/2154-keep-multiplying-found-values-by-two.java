class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean a = true;
        do
        {
         a = check(nums,original);
        if(a==true)
            original = original * 2;
        }
        while(a);
        return original;
    }
    static boolean check(int[] a, int num)
    {
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]==num)
                return true;
        }
        return false;
    }

    }