class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
         Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i!=0 && (nums[i]==nums[i-1]))
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(out.size()>=count)
            {
                List<Integer> list = out.get(count-1);
                list.add(nums[i]);
            }
            else
            {
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[i]);
                out.add(list);
            }
        }
        return out;
        
    }
}