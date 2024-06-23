class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<nums.length-3;i++)
        {
            for(int j = i+1; j<nums.length-2;j++)
            {
                for(int k = j+1 ; k<nums.length-1;k++)
                {
                    int left = k;
                    int right = nums.length - 1;
                    while(left<right)
                    {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                       
                        if(sum<target)
                            left++;
                        else if(sum>target)
                            right--;
                        else
                        {
                             if(nums[i]>0 && nums[j]>0 && nums[left]>0 && nums[right]>0 && target<0)
                                 break;
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[left]);
                            list.add(nums[right]);
                            if(!ans.contains(list))
                                ans.add(list);
                            break;
                        }
                    }
                }
            }
        }
           return ans; 
        
    }
}