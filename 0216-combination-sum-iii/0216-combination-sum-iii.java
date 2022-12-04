class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
          ArrayList<Integer> list = new ArrayList<>();
         
        for (int i = 1; i <=9 ; i++) {
            list.add(i);
        }
        return(cumSum(new ArrayList<>(),list,0,n,k));
        
    }
    static List<List<Integer>> cumSum(ArrayList<Integer> ans, ArrayList<Integer> num, int sum, int target,int win)
    {
        if(sum==target && ans.size()==win )
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
        List<List<Integer>> left = cumSum(clone,new ArrayList<>(num.subList(1, num.size())),sum,target,win);
        ans.remove(ans.size()-1);
        sum = sum - no;
        ArrayList<Integer> clone1 =  (ArrayList<Integer>)ans.clone();
        List<List<Integer>> right=  cumSum(clone1,new ArrayList<>(num.subList(1, num.size())),sum,target,win);
        left.addAll(right);
        return left;
    }
}