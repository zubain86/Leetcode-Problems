class Solution {
    public int similarPairs(String[] words) {
        int i;
        int count  = 0;
        for(i=0;i<words.length-1;i++)
        {
            HashSet<Character> set = new HashSet<>();
            String s = words[i];
            int j;
            for(j=0;j<s.length();j++)
            {
                 char ch = s.charAt(j);
                 set.add(ch);
            }
            for(j= i +1;j <words.length;j++)
            {
                String m = words[j];
                int k;
                int flag = 0;
                HashSet<Character> set2 = new HashSet<>();
                for(k=0;k<m.length();k++)
                {
                    char ch = m.charAt(k);
                    if(!set.contains(ch))
                    {
                        flag = 1;
                        break;
                    }
                    else
                    {
                        set2.add(ch);
                    }
                }
                if(flag==0 && set.size()==set2.size())
                 count++;
            }
        }
        
        return count;
    }
}