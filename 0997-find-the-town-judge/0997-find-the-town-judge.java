class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>(); 
        for(int[] arr : trust)
        {
           int key = arr[0];
           int val = arr[1];
           if(!map.containsKey(key))
           {
              HashSet<Integer> list = new HashSet<>();
               list.add(val);
               map.put(key,list);
           }
            else
            {
                HashSet<Integer> list = map.get(key);
                list.add(val);
                map.put(key,list);
            }
        }
        int count = 0;
        int j = 0;
        for(int i = 1;i<=n;i++)
        {
            if(!map.containsKey(i))
            {
                j = i;
                count++;
            }
        }
        if(count>1)
            return -1;
        else
        {
            for(HashSet<Integer> set : map.values())
            {
                if(!set.contains(j))
                    return -1;
            }
        }
        
        return j;
        
    }
}