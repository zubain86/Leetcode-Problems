class Solution {
    public List<List<String>> partition(String s) {
        return palinPartion(new ArrayList<>(),s);
        
    }
      public List<List<String>> palinPartion(List<String> ans, String s)
    {
        if(s.isEmpty()) {
            List<List<String>> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        List<List<String>> outer = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++) {
             int flag = 0;
            String m = s.substring(0,i);
            int j = 0;
            int k = m.length()-1;
            while(j<=k) {
                if (!(m.charAt(j) == m.charAt(k)))
                {
                    flag =  1;
                    break;
                }
                j++;
                k--;
            }
            if(flag==1)
                continue;
            ans.add(m);
            List<String> clone = new ArrayList<>(ans.subList(0, ans.size()));
            List<List<String>> res = palinPartion(clone,s.substring(i));
            outer.addAll(res);
            ans.remove(ans.size()-1);
            if(s.length()==1)
                return outer;
        }
        return outer;

    }
}