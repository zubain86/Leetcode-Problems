class Solution {
    public int maximum69Number (int num) {
        String s  = Integer.toString(num);
        int i;
        String m = "";
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='6')
            {
                m = m + '9';
                break;
            }
            else
                m = m + ch; 
                
        }
        if(i<s.length())
         m = m + s.substring(i+1,s.length());
         return Integer.parseInt(m);
            
        
    }
}