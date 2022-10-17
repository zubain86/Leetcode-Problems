class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        int i;
        for(i=0;i<sentence.length();i++)
        {
            char ch = sentence.charAt(i);
            set.add(ch);
        }
        char ch;
        for(ch='a';ch<='z';ch++)
        {
            if(!set.contains(ch))
                return false;
        }
        return true;
        
    }
}