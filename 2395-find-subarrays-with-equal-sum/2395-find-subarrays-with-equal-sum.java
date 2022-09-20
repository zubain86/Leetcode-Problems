class Solution {
    public boolean findSubarrays(int[] nums) {
        
        int i;
        List<Integer> list = new ArrayList<>();
        for(i=0;i<nums.length-1;i++)
        {
            list.add(nums[i]+nums[i+1]);
        }
        Collections.sort(list);
        System.out.println(list);
        for(i=0;i<list.size()-1;i++)
        {
            if(list.get(i).equals(list.get(i+1)))
            return true;
        }
        
        return false;
    }
}