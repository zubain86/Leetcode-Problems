class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> can = new ArrayList<>();
        for(int i : candidates)
              can.add(i);
        List<List<Integer>> list = comSum(new ArrayList<>(),can,0,target);
        return list;
       
    }
     public List<List<Integer>> comSum(ArrayList<Integer> ans, ArrayList<Integer> nums, int sum, int target)
    {
        if(sum==target)
        {
            List<List<Integer>> list = new ArrayList<>();
            Collections.sort(ans);
            list.add(ans);
            return list;
        }
        else if(sum>target)
        {
            return new ArrayList<>();
        }
        else
        {
            List<List<Integer>> outer = new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {
                int n = nums.get(i);
                ans.add(n);
                sum = sum + n;
                ArrayList<Integer> clone = (ArrayList<Integer>) ans.clone();
                List<List<Integer>> list = comSum(clone,nums, sum, target);
                sum = sum - n;
                ans.remove(Integer.valueOf(n));
                for (int j = 0; j < list.size(); j++) {
                    if(outer.contains(list.get(j)))
                        continue;
                    else
                        outer.add(list.get(j));
                }
            }
            return outer;
        }

    }
}