class Solution {
    public int numOfSubarrays(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
             prefix[i] = arr[i] + prefix[i-1];
        }
        long even = 0l;
        long odd = 0l;
        long ans = 0l;
        for(int i = 0;i<arr.length;i++)
        {
             if(prefix[i]%2==0)
             {
                 ans = ans + odd;
                 ++even;
             }
            else
            {
                ans+= even + 1l;
                ++odd;

            }
        }
        
        return (int)(ans % (long)(Math.pow(10,9) + 7));
    }
}