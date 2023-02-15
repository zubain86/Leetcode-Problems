class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int i;
        int k = nums.length - 1;
        for(i=2*n - 1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums[i%n])
                stack.pop();
            if(i<n)
            {
                if(!stack.isEmpty() && stack.peek()>nums[i])
                ans[k--] = stack.peek();
                else
                    ans[k--] = -1;
            }
            
            stack.push(nums[i%n]);
            
        }
        
        return ans;
    }
}