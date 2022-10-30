class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        int i,j,k;
        int count = 0;
        for(i=0;i<queries.length;i++)
        {
            String m = queries[i];
            for(j=0;j<dictionary.length;j++)
            {
                String n = dictionary[j];
                for(k=0;k<m.length();k++)
                {
                    if(m.charAt(k)!=n.charAt(k))
                        count++;
                }
                if(count<=2)
                {
                    list.add(m);
                    break;
                }
                count = 0;
            }
            count = 0;
        }
        return list;
        
    }
}