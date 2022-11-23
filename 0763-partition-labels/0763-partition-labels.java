class Solution {
    public List<Integer> partitionLabels(String s) {
          HashMap<Character, List<Integer> >map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               if(!(map.containsKey(ch)))
               {
                   List<Integer> list = new ArrayList<>();
                   list.add(i);
                   list.add(s.lastIndexOf(ch));
                   map.put(ch,list);
               }
        }
        List<List<Integer>> outer = new ArrayList<>();
        for (List<Integer> arr:map.values()) {
            outer.add(arr);
        }
        Collections.sort(outer,(a,b)->Integer.compare(a.get(0),b.get(0)));
        List<Integer> res = new ArrayList<>();
        int pres = outer.get(0).get(0);
        int prel = outer.get(0).get(1);
        for (List<Integer> arr:outer) {
            int start = arr.get(0);
            int last = arr.get(1);
            if(last>prel && start>prel){
                res.add(start);
                pres = start;
                prel = last;
            }
            if(last>prel && start<prel)
                prel = last;
        }
        res.add(s.length());
        List<Integer> ans = new ArrayList<>();
        if(res.size()>1)
        {
            ans.add(res.get(0));
            for (int i = 1; i <res.size() ; i++) {
                ans.add(res.get(i)-res.get(i-1));
            }
            
            return ans;
        }
        return res;
    }
}