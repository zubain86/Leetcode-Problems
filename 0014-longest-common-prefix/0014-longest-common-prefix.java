class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length==1)
             return strs[0];
         String s1 = strs[0];
        String s2 = strs[1];
        String lc = "";
        int i = 0,j = 0;
        while(i<s1.length() && j<s2.length() && s1.charAt(i)==s2.charAt(j))
        {
            lc += s1.charAt(i);
            i++;
            j++;
        }
        for (int j2 = 2; j2 < strs.length; j2++) {
            String temp = strs[j2];
            
                String nlc = "";
                int k1 = 0,k2 = 0;
                while(k1<temp.length() && k2<lc.length() && temp.charAt(k1)==lc.charAt(k2))
                {
                    nlc += temp.charAt(k1);
                    k1++;
                    k2++;
                }
                lc = nlc;
            
        }

        return lc;
        

    }
        
    
}