class Solution {
    public int xorOperation(int n, int start) {
        int i;
        int[] nums = new int[n];
        for(i=0;i<n;i++)
        {
            nums[i] = start+2*i;
        }
        int a=0;
        for(i=0;i<n;i++)
        {
            a = a ^ nums[i];
        }
        
        return a;
        
    }
}