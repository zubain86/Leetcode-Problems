class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> cont = new HashSet<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(!cont.contains(nums[i]))
                cont.add(nums[i]);
            else
                res.add(nums[i]);
        }
        
        return res;
        
    }
}