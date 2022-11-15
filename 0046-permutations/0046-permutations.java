class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i: nums)
        {
            num.add(i);
        }
        
        return perm(new ArrayList<>(),num);
        
    }
    public List<List<Integer>> perm(ArrayList<Integer> ans, ArrayList<Integer> num)
    {
        if(num.isEmpty()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        List<List<Integer>> outer = new ArrayList<>();
        int n = num.get(0);
        for (int i = 0; i <= ans.size() ; i++) {
            ArrayList<Integer> f = new ArrayList<>(ans.subList(0,i));
            ArrayList<Integer> l = new ArrayList<>(ans.subList(i,ans.size()));
            ArrayList<Integer> res = new ArrayList<>();
            res.addAll(f);
            res.add(n);
            res.addAll(l);
            List<List<Integer>> list = perm(res,new ArrayList<>(num.subList(1, num.size())));
            outer.addAll(list);
        }
        return outer;
    }

}