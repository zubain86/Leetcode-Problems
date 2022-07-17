class Solution {
    public int lengthOfLastWord(String s) {
        int i;
        for(i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
             break; 
             }
        s = s.substring(0,i+1);
        String m = "";
        for(i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
                m = m + c;
            else
                break;
        }
        return m.length();
        
    }
}