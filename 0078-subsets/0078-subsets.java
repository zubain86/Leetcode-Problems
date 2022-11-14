class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i: nums)
            num.add(i);
        List<List<Integer>> list = subSum(new ArrayList<>(),num);
        return list;
        
    }
     public List<List<Integer>> subSum(ArrayList<Integer> ans, ArrayList<Integer> num)
    {
        if(num.isEmpty())
        {
            ArrayList<List<Integer>> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int no = num.get(0);
        ans.add(no);
        ArrayList<Integer> clone = (ArrayList<Integer>)ans.clone();
        List<List<Integer>> left = subSum(clone,new ArrayList<>(num.subList(1, num.size())));
        ans.remove(ans.size()-1);
        ArrayList<Integer> clone1 =  (ArrayList<Integer>)ans.clone();
        List<List<Integer>> right=  subSum(clone1,new ArrayList<>(num.subList(1, num.size())));
        left.addAll(right);
        return left;
    }
}