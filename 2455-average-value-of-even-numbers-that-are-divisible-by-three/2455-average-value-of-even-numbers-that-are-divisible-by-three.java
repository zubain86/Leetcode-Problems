class Solution {
    public int averageValue(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
                list.add(nums[i]);
        }
        if(list.size()==0)
            return 0;
        else
        {
            double sum = 0;
            for(i=0;i<list.size();i++)
            {
                sum = sum + list.get(i);
            }
            double res = sum/(double)list.size();
            return (int)res;
        }
        
    }
}