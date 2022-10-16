class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
            set.add(i);
        int i;
        for(i=0;i<nums.length;i++)
        {
            String s = Integer.toString(nums[i]);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String m = sb.toString();
            set.add(Integer.parseInt(m));
        }
        return set.size();
        
    }
}