class Solution {
    public boolean isCircularSentence(String sentence) {
        ArrayList<Character> list = new ArrayList<>();
        int i;
        for(i=0;i<sentence.length();i++)
        {
            char ch  = sentence.charAt(i);
            if(i==0 || i==sentence.length()-1)
                list.add(ch);
            else if(ch == ' ')
            {
                list.add(sentence.charAt(i-1));
                list.add(sentence.charAt(i+1));
            }
          
        }
        if(list.get(0)==list.get(list.size()-1))
        {
            for(i=1;i<list.size()-1;i+=2)
            {
                if(list.get(i)!=list.get(i+1))
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        
        return true;
    }
}