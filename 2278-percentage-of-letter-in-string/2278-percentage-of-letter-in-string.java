class Solution {
    public int percentageLetter(String s, char letter) {
        
        int count = 0;
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==letter)
                count++;
        }
        
        int per = (count*100)/s.length();
        return per;
    }
}