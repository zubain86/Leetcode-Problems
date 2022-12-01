class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length/2;
        int num = nums[n];
        int moves = 0;
        for(int i = 0;i<n;i++)
        {
            int cal = num - nums[i];
            moves+= cal;
        }
        for(int i = n+1;i<nums.length;i++)
        {
            int cal = nums[i] - num;
            moves+= cal;
        }
        
        return moves;
        
    }
}