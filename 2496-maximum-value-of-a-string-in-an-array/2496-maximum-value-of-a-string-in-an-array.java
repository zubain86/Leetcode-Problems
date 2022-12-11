class Solution {
    public int maximumValue(String[] strs) {
           
         int j,max=0;
        for(j=0;j<strs.length;j++)
        {
            max = Math.max(max,helper(strs[j]));
        }
        
        return max;
    }
    public int helper(String s)
    {
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                return s.length();
        }
        
        return Integer.parseInt(s);
    }
    
}