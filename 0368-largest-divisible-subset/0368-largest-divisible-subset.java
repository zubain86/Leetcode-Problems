class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
         List<Integer> res = new ArrayList<>();
        List[][] dp = new List[nums.length][nums.length+1];
        res = helper(0,-1,nums,dp);
        return res;
    }
     public static List<Integer> helper(int ind,int pre_ind,int[] arr,List[][] dp)
    {
        if(ind==arr.length)
            return new ArrayList<>();
        if(dp[ind][pre_ind+1]!=null) {
            List<Integer> clone = new ArrayList<>();
            List<Integer> res = dp[ind][pre_ind+1];
            for (Integer i: res) {
                clone.add(i);
            }
            return clone;
        }
        List<Integer> c = new ArrayList<>();
        List<Integer> nc = helper(ind+1,pre_ind,arr,dp);
        if(pre_ind==-1 || arr[ind]%arr[pre_ind]==0 || arr[pre_ind]%arr[ind]==0){
            c =  helper(ind+1,ind,arr,dp);
            c.add(0,arr[ind]);
        }
        List<Integer> res;
        if(nc.size()>c.size())
            res = nc;
        else
            res = c;
        dp[ind][pre_ind+1] = res;
        List<Integer> clone = new ArrayList<>();
        for (Integer i:res) {
            clone.add(i);
        }
        return clone;

    }
}