class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> can = new ArrayList<>();
        for(int i : candidates)
            can.add(i);
        Collections.sort(can);
        List<List<Integer>> list = cumSum(new ArrayList<>(), can, 0, target);
        return list;
                    
    }
      public List<List<Integer>> cumSum(ArrayList<Integer> ans, ArrayList<Integer> num, int sum, int target)
    {
        if(sum==target)
        {
            List<List<Integer>> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        else if(sum>target || num.isEmpty())
        {
            return new ArrayList<>();
        }
        int no = num.get(0);
        ans.add(no);
        sum = sum + no;
        ArrayList<Integer> clone = (ArrayList<Integer>) ans.clone();
        List<List<Integer>> left = cumSum(clone,new ArrayList<>(num.subList(1, num.size())),sum,target);
        ans.remove(ans.size()-1);
        sum = sum - no;
        int i = 1;
        while(i<num.size()){
            if(num.get(i).equals(num.get(i-1)))
                i++;
            else
               break;
        }
        ArrayList<Integer> clone1 =  (ArrayList<Integer>)ans.clone();
        List<List<Integer>> right=  cumSum(clone1,new ArrayList<>(num.subList(i, num.size())),sum,target);
        left.addAll(right);
        return left;
    }
}