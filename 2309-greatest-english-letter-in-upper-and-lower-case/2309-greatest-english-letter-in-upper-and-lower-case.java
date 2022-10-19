class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            set.add(ch);
        }
        String max = "";
        char ch;
        for(ch='A';ch<='Z';ch++)
        {
            if(set.contains(ch)&& set.contains(Character.toLowerCase(ch)))
            {
                max = "";
                max = max + ch;
            }
        }
        return max;
    }
}