class Solution {
    

    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        long sum = 0l;
        long maxSum   = 0l;
       while(j<nums.length)
        {
            if(!(map.containsKey(nums[j]))){
            sum = sum + nums[j];
            if(j-i+1==k)
            {
                if(sum>maxSum)
                    maxSum = sum;
                sum = sum - nums[i];
                 map.remove(nums[i]);
                i++;
            }
            }
            if(map.containsKey(nums[j]))
            {
                i = map.get(nums[j])+1;
                j = i;
                sum = 0l;
                map.clear();
            }
            else
            {
            map.put(nums[j],j);        
            j++;
            }
        }

        return maxSum;
        
}}