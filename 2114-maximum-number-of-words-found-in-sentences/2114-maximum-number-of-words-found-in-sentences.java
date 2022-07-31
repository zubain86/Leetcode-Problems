class Solution {
    public int mostWordsFound(String[] sentences) {
        int i;
        int prev = 0;
        int newo = 0;
        for(i=0;i<sentences.length;i++)
        {
            newo = countString(sentences[i]);
            if(newo>prev)
                prev = newo;
        }
        return prev;
        
    }
    public static int countString(String s)
    {
        int i;
        int count =1;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch))
                count++;
        }
        return count;
    }
}