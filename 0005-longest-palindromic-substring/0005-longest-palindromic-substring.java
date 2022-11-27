class Solution {
    public String longestPalindrome(String s) {
        String m = "";
        for (int i = 0; i <= s.length()-1; i++) {
            int l, r;
            l = i;
            r = i;
            while(l>=0 && r<=s.length()-1 && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>m.length())
                m = s.substring(l,r+1);
                l--;
                r++;
            }
            l = i;
            r = i+1;
            while(l>=0 && r<=s.length()-1 && s.charAt(l)==s.charAt(r)){
                if(r-l+1>m.length())
                    m = s.substring(l,r+1);
            l--;
            r++;
        }}
     return m;
        
    }
    
    
}