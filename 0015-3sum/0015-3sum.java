class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++)
        {
            int a = nums[i];
            if(i>0 && a == nums[i-1])
                continue;
            else
            {
                int l = i+1;
                int r = nums.length-1;
                while(l<r)
                {
                  int threesum = a + nums[l] + nums[r];  
                    if (threesum<0)
                        l++;
                    else if(threesum>0)
                        r--;
                    else
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(a);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        out.add(list);
                        l++;
                        while(l<r && nums[l]==nums[l-1] )
                        {
                            l++;
                        }
                    }
                }
            }
        }
        return out;
    }
}